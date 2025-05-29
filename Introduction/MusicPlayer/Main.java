package MusicPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // .wav, .au, .aiff
        // mp3 requires additional external library like javafx
        String path = "Introduction/MusicPlayer/music.wav";
        File file = new File(path);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String inp = "";
            while (!inp.equals("q")){
                System.out.println("P = Play\nS = Stop\nR = Reset\nQ = Quit");
                System.out.print("Enter your choice: ");

                inp = scanner.next().toLowerCase();

                switch (inp){
                    case "p" -> clip.start();
                    case "s" -> clip.stop();
                    case "r" -> clip.setMicrosecondPosition(0);
                    case "q" -> clip.close();
                    default -> System.out.println("Invalid choice!");
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Couldn't find file");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Unsupported file type!");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource.");
        }
        finally {
            System.out.println("Exited from audio played");
        }
    }
}
