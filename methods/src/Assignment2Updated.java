import java.util.Scanner;

class Assignment2Updated { //setting up arrays.
    static String[] singleDigit = {"", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine"};
    static String[] TwoDigits = {" ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};
    static String[] MultiplesOfTens = {"", "", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};
    static String[] PowerOfTens = {"", " thousand", " million", " billion", " trillion"};

    public static void main(String[] arg) { //To prompt user to enter an amount
        int num1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value ");
        num1 = input.nextInt();
        input.close();
        System.out.println(Thousands(num1)); //sending entered value to method Thousands
    }
    public static String Thousands(long amount) {
        String Word = "";
        int i = 0, num2;

        if (amount == 0)
            System.out.println("Invalid amount entered ");
        else

            while (amount > 0) {

                num2 = (int) (amount % 1000); // since the numbers of power of ten increases by three 0's, if modulo has been used once, it means the number entered is a thousand because it returns 0 in modulo and index increments, int is used since amount has been set to long
                if (num2 != 0) {
                    String NewStringVal = HundredOnly(num2); // value in variable num2 is send to and returned from method HundredOnly
                    Word = NewStringVal + PowerOfTens[i] + Word; //this particular code of line links the previous data to the new data in the variable.
                }
                i++; // index will be incremented everytime when amount is divided by 1000 until a remainder that is not 0 is found
                amount = amount / 1000; //if a remainder is not found in the first modulo, the amount will be divided until a reminder is found.

            }
        return Word;

    }

    public static String HundredOnly(int num4) {// a method for 3 digit number or less only
        String word = "";
        int num3;
        num3 = num4 % 100; //only remainder part needed

        if (num3 < 10) {
            word = singleDigit[num3];
        } else if (num3 < 20) {
            word = TwoDigits[num3 % 10];
        } else {
            word = MultiplesOfTens[num3 / 10] + singleDigit[num3 % 10]; // dividing with 10 will extract the integer part, using modulo will extract the remainder part
        }

        if (num4 / 100 > 0)
            word = singleDigit[num4 / 100]+ " hundred"   + word;
        return word; //value will be returned to method Thousands
    }


}


