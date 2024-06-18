import java.util.*;

public class Source { //Aidan Meyer Assignment 1 Submission - Implementing Babylonian and Russian algorithms!
    public static void main(String[] args){
        Algorithm algorithm = new Algorithm(); //algorithm object
        int rAnswer;
        double bAnswer;

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("Select An Algorithm Below:");
        System.out.println("Type 'Babylonian' for the babylonian Method");
        System.out.println("Type 'Russian' for russian multiplication");
        System.out.println("================================================");

        String line = scanner.nextLine();

        while(!line.equals("Babylonian") && !line.equals("Russian")) {
            System.out.println("I did not get that, please type 'Babylonian' or 'Russian':");
            line = scanner.nextLine();
        }

        System.out.println("Enter a number: ");
        String str = scanner.nextLine(); //grab first number - will be parsed to either an int or a double


        if(line.equals("Russian")){ //
            System.out.println("Enter another number: ");
            String str2 = scanner.nextLine();

            int num = Integer.parseInt(str);
            int num2 = Integer.parseInt(str2);

            while(num < 0 || num2 < 0){ //check if both integers are positive
                if(num < 0){
                    System.out.println("Please re-enter the first number to make sure it is positive:");
                    str = scanner.nextLine();
                    num = Integer.parseInt(str);

                }
                else{
                    System.out.println("Please re-enter the second number to make sure it is positive:");
                    str2 = scanner.nextLine();
                    num2 = Integer.parseInt(str2);
                }
            }

            rAnswer = algorithm.russianMultiplication(num, num2);

            System.out.println("The answer is: " + rAnswer);
        }
        else{ //perform babylonian method
            System.out.println("Enter a guess:");
            String strGuess = scanner.nextLine();

            double num = Double.parseDouble(str);
            double guess = Double.parseDouble(strGuess);

            bAnswer = algorithm.babylonianMethod(num, guess);

            System.out.println("The answer is: " + bAnswer);
        }
    }
}
