import java.util.Scanner;

class GuessingGame {
     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("ADMINISTRATOR\n===============\n");
     System.out.print("Name of item in the jar?  ");
     String item = scanner.nextLine();
     System.out.printf("Maximum number of %ss in the jar:  ",
                     item);
     int maxNumber = scanner.nextInt();
       
     Jar jar = new Jar(item, maxNumber);
     Prompter prompter = new Prompter(jar);
     
     jar.fill();
     System.out.printf("%n%n"); 
     System.out.print("PLAYER\n===============\n");  
     System.out.printf("Your goal is to guess how many %ss are in the jar. Pick a number between 1 and %s.%n",
                      jar.getItem(),
                      jar.getMaxNumber());


     while (prompter.promptForGuess() == false) {
       prompter.promptForGuess();
     }
       prompter.displayOutcome();
    }
}