import java.util.Scanner;
class Date_Valid {
    public static void main(String[] args) {

        int day, month, year;
        boolean valid = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter day ");
        day = input.nextInt();
        System.out.println("Enter months ");
        month = input.nextInt();
        System.out.println("Enter year");
        year = input.nextInt();

        input.close();


        if (day >= 1 || day <= 31) {
            if (month >= 1 || month <= 12) {
                if (year >= 1) {

                    // For months with 30 days.
                    if ((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30) {
                        valid = true;
                    }
                    // For months with 31 days.
                    if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day <= 31) {
                        valid = true;
                    }
                    // For February.
                    if (month == 2) {
                        if (day <= 28) {
                            valid = true;
                        } else if (day == 29) {
                            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                                valid = true;
                            } //else invalid
                        }
                        valid = false; //else date is not valid
                    }
                    else valid = false;
                }
            }
        }
        if (valid == true)
            System.out.println(day + " " + month + " " + year + " is a valid date");
        else
            System.out.println(day + " " + month + " " + year + " is not a valid date");
    }
}



