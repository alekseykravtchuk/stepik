package entity;

public class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return  y;
    }

    public void turnLeft() {
        switch (getDirection()) {
            case UP:
                direction = Direction.LEFT;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case LEFT:
                direction = Direction.DOWN;
                break;
            case RIGHT:
                direction = Direction.UP;
        }
    }

    public void turnRight() {
            switch (getDirection()) {
                case UP:
                    direction = Direction.RIGHT;
                    break;
                case DOWN:
                    direction = Direction.LEFT;
                    break;
                case LEFT:
                    direction = Direction.UP;
                    break;
                case RIGHT:
                    direction = Direction.DOWN;
            }
    }

    public void stepForward() {
                switch (getDirection()) {
                    case UP:
                        y++;
                        break;
                    case DOWN:
                        y--;
                        break;
                    case LEFT:
                        x--;
                        break;
                    case RIGHT:
                        x++;
                }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }
}

