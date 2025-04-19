public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 24; i++) {
            result.append("Number: ").append(i).append("\n");
        }
        System.out.println(result.toString());
    }
}
