import entity.Direction;
import entity.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(10, 15, Direction.UP);
        moveRobot(robot, 4, 3);
        System.out.println(robot);
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            robot.stepForward();
        }

        while (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            robot.stepForward();
        }

        while (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            robot.stepForward();
        }

        while (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            robot.stepForward();
        }
    }
}
