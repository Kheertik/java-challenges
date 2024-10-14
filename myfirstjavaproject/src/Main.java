public class Main {
    public static void main(String[] args) {
        String value = "aaabbcd";


        for (int i = 0; i < value.length(); i++) {
            char character = value.charAt(i);
            boolean isRepeating = false;

            for (int j = 0; j < value.length(); j++) {
                if (i != j && character == value.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }

            if (!isRepeating) {
                System.out.println("Non-repeating character is: " + character);
            }
        }
    }
}
