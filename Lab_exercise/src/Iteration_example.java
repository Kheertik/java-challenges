import java.util.Scanner;

class iteration_example{
    public static void main(String [] args){
       int[] arr = new int[3];
       int i;

       Scanner input = new Scanner(System.in);

       for (i = 0; i < 3; ++i){
           System.out.print("Enter an Integer");
           arr[i] = input.nextInt();
       }
       input.close();

       for (i = 0; i < 3    ; ++i) {
           System.out.println("Element at index " + i + " : " + arr[i]);
       }
    }
}
