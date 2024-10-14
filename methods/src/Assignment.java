
import java.io.*;
import java.util.Scanner;

class Assignment { //setting up arrays.
    static String[] singleDigit = {"", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine"}; //the reason for null at the index 0 is to ease and simplify things.
    static String[] TwoDigits = {" ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};
    static String[] MultiplesOfTens = {"", "", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};
    static String[] PowerOfTens = {"", " thousand", " million", " billion", " trillion", " quadrillion ", " quintillion", " sextillion", " septillion"};

    public static void main(String[] arg) { //To prompt user to enter an amount
        double num1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value ");
        num1 = input.nextDouble();
        input.close();
        System.out.println(Thousands(num1)); //sending entered value to method Thousands
    }
    public static String Thousands(Double amount) {
        String Word = "";
        String NewstringVal = "";
        int i = 0, num2;

        if (amount == 0)
            System.out.println("Invalid amount entered ");
        else

            while (amount > 0) {

                num2 = (int) (amount % 1000); // since the numbers of power of ten increases by three 0's, if modulo has been used once, it means the number entered is a thousand, index increments and if modulo has been used 2, it means it the value is million, i increases again. Int is used since amount has been set to long
                if (num2 != 0) {
                    NewstringVal = HundredOnly(num2); // value in variable num2 is send to and returned from method HundredOnly
                    Word = NewstringVal + PowerOfTens[i] + Word; //this particular code of line links the previous data to the new data in the variable.

                }
                i++; // i will keep increasing until amount / 1000 will return 0, increasing i will choose the PowerOfTens.
                amount = amount / 1000; //if an integer part is not found in the first modulo, the amount will be divided until an integer part is found.

            }

       return Word;
    }

    public static String HundredOnly(int num4) {// a method for 3 digit number or less only
        String word = "";
        int num3;
        num3 = num4 % 100; //only remainder part needed

        if (num3 < 10)  // finding the appropriate value in the array
            word = singleDigit[num3];
        else if (num3 < 20)  // finding the appropriate value in the array
            word = TwoDigits[num3 % 10]; // finding the appropriate value in the array
        else
            word = MultiplesOfTens[num3 / 10] + singleDigit[num3 % 10]; // dividing with 10 will extract the integer part, using modulo will extract the remainder part


        if (num4 / 100 > 0)// if there is an integer part, there it means it's a hundred.
            word = singleDigit[num4 / 100]+ " hundred"   + word;
        return word; //value will be returned to method Thousands
    }


}




