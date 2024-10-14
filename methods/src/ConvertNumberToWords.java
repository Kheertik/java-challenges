import java.util.Scanner;
//https://www.netjstech.com/2018/11/converting-numbers-to-words-java-program.html//

class ConvertNumToWords{
    private static final String[] units = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine"
    };
    private static final String[] twoDigits = {
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };
    private static final String[] tenMultiples = {
            "",
            "",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };
    private static final String[] placeValues = {
            " ",
            " thousand", // iterates 3 times
            " million", // iterates 6 times
            " billion", // iterates 9 times
            " trillion"
    };

    private static String convertNumber(long number) {
        String word = "";
        int index = 0;
        do {
           // take 3 digits in each iteration
           // Like 11293847129.
            int num = (int)(number % 1000); // the first % 1000 will evaluate to 129
            if (num != 0){
                String str = ConversionForUpToThreeDigits(num); //ConversionForUpToThreeDigits(129)

               word = str + placeValues[index] + word;
            }
            index++;
            // next 3 digits
            number = number/1000;
        } while (number > 0);
        return word;

    }

    private static String ConversionForUpToThreeDigits(int number) {
        String word = "";
        int num = number % 100; //129 % 100 == 29
        if(num < 10){
            word = word + units[num];
        }
        else if(num < 20){
            word = word + twoDigits[num%10];
        }else{
            word = tenMultiples[num/10] + units[num%10]; //tenMultiples[29/10] + units[29%10] == tenMultiples[2] + units[9] == twenty nine
        }
               //  (1 > 0)?          units[1]
            word = (number/100 > 0)? units[number/100] + " hundred" + word : word; // units[1] +hundred+ twenty nine == one hundred twenty nine
        return word;
        //This was the first iteration. The next will be with 11293847129/1000 (11293847).
    }

    public static void main(String[] args) {
        int num1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value ");
        num1 = input.nextInt();
        input.close();

        System.out.println(convertNumber(num1));

    }
}

