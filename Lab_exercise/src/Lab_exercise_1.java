//doing calculations*

import java.util.Scanner;
class lab_exercises{
    public static void main(String[] args){
        int x;
        int y;
        int cal = 0;
        String process;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a value ");
        x = input.nextInt();
        
        System.out.println("Enter a value ");
        y = input.nextInt();
        
        System.out.println("Enter process");
        process  = input.next();
        input.close();

        if (process == "add") {
            cal = x + y;
        }
        else
            if (process == "sub"){
                cal = x - y;
            }
            else
                if (process == "mul"){
                    cal  = x * y;
                }
                else
                    if (process == "div"){
                        cal = x / y;
                    }
                    else
                        if (process == "pow"){
                            cal = (int) Math.pow(x,y);
                        }
        System.out.println("Chosen process: "+ process + " calculation answer: " + cal);
    }
}

