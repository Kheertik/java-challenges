import java.util.Scanner;

class CTW3 {
    public static final String[] UNITPLACE = {" ", "ONE ", "TWO ", "THREE ", "FOUR ", "FIVE ", "SIX ", "SEVEN ", "EIGHT ", "NINE ", "TEN ", "ELEVEN ", "TWELVE ", "THIRTEEN ", "FOURTEEN ", "FIVETEEN ", "SIXTEEN ", "SEVENTEEN ", "EIGHTEEN ", "NINETEEN "};
    public static final String[] TENPLACE = {" ", "TWENTY ", "THIRTY ", "FOURTY ", "FIVETY ", "SIXTY ", "SEVENTY ", "EIGHTY ", "NINETY "};
    public static final String[] MOREPLACE = {" ", "HUNDRED ", "THOUSAND ", "LAKH ", "CRORE ", "ARAB ", "KHARAB ", "NIL ", "PADM ", "SANKH ", "MAHA SANKH "};

    public static void numberSplit(long no, int digit, int len) {
        if (no > 0) {
            if (len == 2)
                numberSplit(no / 10, (int) (no % 10), len + 1);
            else
                numberSplit(no / 100, (int) (no % 100), len + 2);
        }
        if (digit > 0)
            wordPrint(digit, len);
    }

    public static void wordPrint(int digit, int len) {
        if (digit < 20)
            System.out.print(UNITPLACE[digit]);
        else {

            System.out.print(TENPLACE[(digit / 10) - 1]);

            if (digit % 10 != 0)
                System.out.print(UNITPLACE[digit % 10]);
        }
        if (len > 2)
            System.out.print(MOREPLACE[len / 2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long no = sc.nextLong();
        numberSplit(no, 0,0);
        System.out.print("ONLY");
    }
}
