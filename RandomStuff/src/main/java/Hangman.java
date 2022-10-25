import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * Lab 6 for ATCS
 *
 * @author Ari Camhi
 * @version 10-13-22
 */
public class Hangman {
    public static void main(String[] args) {
        Hangman hm = new Hangman();
        //hm.hangmanUI();
    }

    private String hangWord;

    public void setEnteredText(String hangWord) {
        this.hangWord = hangWord;
    }

    /**
     * Full code for the hangman game with no GUI representation
     */
    public void hangmanUI(HangmanGUI hangmanGUI) {
        //New Scanner
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;
        //Starts program
        String response;
        while (playAgain) {
            //Initial word you are playing hangman with
            System.out.println("Insert word you are playing hangman with: ");
            String hangWord = sc.next();
            //List<Character> word = hangWord.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
            //Converting String to an ArrayList
            String[] strSplit = hangWord.split("");
            ArrayList<String> hwArrli = new ArrayList<String>(Arrays.asList(strSplit));
            //Instead of clearing terminal, hits return 100 times
            for (int i=0; i < 100; ++i)
                System.out.println();
            System.out.flush();
            //Changes String currentStatus into a StringBuilder
            StringBuilder currentStatus = new StringBuilder();
            //Amount of wrong guesses left
            int attemptCounter = 6;
            //Makes currentStatus just _ repeated n times
            currentStatus.append("_".repeat(hwArrli.size()));
            StringBuilder wrongGuesses = new StringBuilder();

            while (currentStatus.toString().contains("_") && attemptCounter != 0) {
                System.out.println("Input letter you would like to guess: ");
                String guess = sc.next();
                if (guess.length() >= 1) {
                    guess = String.valueOf(guess.charAt(0));
                }
                if (hwArrli.contains(guess)) {
                    System.out.println("Congrats, the word contains that letter");
                    for(int i = 0; i < hwArrli.size(); i++){
                        if(Objects.equals(hwArrli.get(i), guess)){
                            String c = hwArrli.get(i);
                            char j = c.charAt(0);
                            currentStatus.setCharAt(i, j);
                        }
                    }
                    System.out.println("Here is your current status: " + currentStatus);
                    String s = hwArrli.get(hwArrli.indexOf(guess));
                }
                else {
                    hangmanGUI.decrementGuess();
                    System.out.println("Your guess was wrong unfortunately");
                    wrongGuesses.append(guess).append(" ");
                    attemptCounter--;
                    System.out.println("Here's how many guesses you have left: " + attemptCounter);
                    System.out.println("Already guessed: " + wrongGuesses);
                }
            }
            playAgain = false;
            if (!currentStatus.toString().contains("_")){
                    System.out.println("Congrats you won!! Would you like to play again? (yes/no)");
                    response = sc.next();
                    if (response.equalsIgnoreCase("yes")){
                        playAgain = true;
                    }
                }
                else if(attemptCounter == 0){
                    System.out.println("Sadly, you lost... Would you like to play again? (yes/no)");
                    response = sc.next();
                    if (response.equalsIgnoreCase("yes")){
                        playAgain = true;
                    }
                }
            }
        System.out.println("Program has closed :(");
        sc.close();
        }
    }
