package TextPerRole;

public class TextPerRole {
    private static String [] roles = {
            "Городничий","Аммос Федорович",
            "Артемий Филиппович",
            "Лука Лукич"};
    private static String [] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
            "Аммос Федорович: Как ревизор?",
            "Артемий Филиппович: Как ревизор?",
            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
            "Аммос Федорович: Вот те на!",
            "Артемий Филиппович: Вот не было заботы, так подай!",
            "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String role : roles) {
            stringBuilder.append(role);
            stringBuilder.append(":\n");
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(role + ":")) {
                    stringBuilder.append(String.format("%d) %s\n", i + 1, textLines[i].substring(role.length() + 2)));
                }
            }

            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        TextPerRole textPerRole = new TextPerRole();
        System.out.println(textPerRole.printTextPerRole(roles, textLines));
    }


}