import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) throws FileNotFoundException {
        // Hangman game

        String filePath = "src\\words.txt";
        ArrayList<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e) {
            System.out.println("Something went wrong");;
        }

        Random random = new Random();
        char option = 'y';
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                *****************************
                Welcome to Java Hangman Game!
                *****************************
                """);

        while (option == 'y'){
            String word = words.get(random.nextInt(words.size()));

            ArrayList<Character> wordState = new ArrayList<>();
            int wrongGuesses = 0;

            for(int i=0; i<word.length(); i++){
                wordState.add('_');
            }

            while (wrongGuesses<6){
                System.out.print("Word : ");

                for(char c: wordState){
                    System.out.print(c + " ");
                }
                System.out.println();

                System.out.println(getHangmanArt(wrongGuesses));

                System.out.print("Guess a letter: ");
                char guess = scanner.next().toLowerCase().charAt(0);

                if((word.toLowerCase()).indexOf(guess)>=0){
                    System.out.println("Correct guess\n");
                    for(int i=0; i<word.length();i++){
                        if ((word).toLowerCase().charAt(i) == guess){
                            wordState.set(i, guess);
                        }
                    }

                    if (!wordState.contains('_')){
                        System.out.println(getHangmanArt(wrongGuesses));
                        System.out.println("You won!");
                        System.out.println("The word was: "+ word);
                        break;
                    }

                }else {
                    System.out.println("Wrong guess\n");
                    wrongGuesses++;
                }
            }

            if (wrongGuesses>=6){
                System.out.println(getHangmanArt(wrongGuesses));
                System.out.println("You lost");
                System.out.println("The word was: "+ word);
            }

            System.out.print("Do you wanna continue? (y/n) ");
            option=scanner.next().toLowerCase().charAt(0);
        }

        scanner.close();
    }

    static String getHangmanArt(int wrongGuesses){
        return switch (wrongGuesses){
            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                      o
                    
                    
                    """;
            case 2 -> """
                      o
                      |
                    
                    """;
            case 3 -> """
                      o
                     /|
                    
                    """;
            case 4 -> """
                      o
                     /|\\
                    
                    """;
            case 5 -> """
                      o
                     /|\\
                     /
                    """;
            case 6 -> """
                      o
                     /|\\
                     / \\
                     GAME OVER
                    """;
            default -> "";
        };
    }
}
