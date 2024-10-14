import java.util.Scanner;

class mod {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number ");
        int x = input.nextInt();
        System.out.println("Enter a dividen ");
        int div = input.nextInt();
        input.close();

        int y = x % div;
        int u = x / div;
        int b = u % div;

        System.out.println("Mod of x: "+ y);
        System.out.println("Mod of U: "+ b);
        System.out.println("Div of x: "+ u);



    }
}
