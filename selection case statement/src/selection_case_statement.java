import java.util.Scanner;

class VowelCheck {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char character;

        System.out.println("Enter a character");
        character = scan.next().charAt(0);

        switch (character) {
            case 'a', 'A', 'i', 'I', 'e', 'E', 'o', 'O', 'u', 'U', 'y', 'Y' -> System.out.println("This is a vowel");
            default -> System.out.println("This not a vowel");
        }
    }
}