import java.util.Scanner;

    public class Main {
        public static void main(String args[]) {

            //creates variables and scanner
            Scanner scan = new Scanner(System.in);

            //variables
            int i = 0, stringLength;
            long decimal = 0;
            String userHex;

            //user input
            System.out.print("Enter a hexadecimal number: ");
            userHex = scan.next();
            stringLength = userHex.length()-1;

            //loops through each character of the input and checks its type
            while (i <= stringLength)
            {
                //disregards 0x if input begins with it
                if (userHex.charAt(0) == '0' && userHex.charAt(1) == 'x')
                {
                    userHex = userHex.substring(2);
                    stringLength = userHex.length()-1;
                }

                //converts numbers in input to hexadecimal
                if (Character.isDigit(userHex.charAt(i)))
                {
                    decimal += (long) Math.pow(16, stringLength - i) * Integer.parseInt(userHex.substring(i,i+1));
                }

                //converts letters A-F (a-f) to hexadecimal
                if (Character.isLetter(userHex.charAt(i)))
                {
                    if(userHex.charAt(i) == 'A' || userHex.charAt(i) == 'a'){
                        decimal += (long) Math.pow(16, stringLength - i) * 10;
                    }
                    if(userHex.charAt(i) == 'B' || userHex.charAt(i) == 'b'){
                        decimal += (long) Math.pow(16, stringLength - i) * 11;
                    }
                    if(userHex.charAt(i) == 'C' || userHex.charAt(i) == 'c'){
                        decimal += (long) Math.pow(16, stringLength - i) * 12;
                    }
                    if(userHex.charAt(i) == 'D' || userHex.charAt(i) == 'd'){
                        decimal += (long) Math.pow(16, stringLength - i) * 13;
                    }
                    if(userHex.charAt(i) == 'E' || userHex.charAt(i) == 'e'){
                        decimal += (long) Math.pow(16, stringLength - i) * 14;
                    }
                    if(userHex.charAt(i) == 'F' || userHex.charAt(i) == 'f'){
                        decimal += (long) Math.pow(16, stringLength - i) * 15;
                    }
                }
                i++;
            }
            System.out.print("Your number is " + decimal + " in decimal");
        }
    }
