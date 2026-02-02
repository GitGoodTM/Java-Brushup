import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AudioPlayer {
    public static void main(String[] args) {

        // how to play audio
        // cannot play .mp3
        // can play .wav, .au, .aiff

        String audioFilePath = "src\\The Great Southern Trendkill.wav";
        File file = new File(audioFilePath);


        //what's happening

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audio = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audio);

            String response = "";

            while(!response.equalsIgnoreCase("Q")){

                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");
                response = scanner.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid command");
                }
            }

        } catch (IOException e){

            System.out.println("Something went wrong");

        } catch (UnsupportedAudioFileException e) {

            System.out.println("Audio format is not supported");
            throw new RuntimeException(e);

        } catch (LineUnavailableException e) {

            System.out.println("Audio unavailable");
            throw new RuntimeException(e);

        } finally {
            System.out.println("Getcha pull");
        }
    }
}
