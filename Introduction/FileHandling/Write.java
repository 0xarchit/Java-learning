package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args){
        String path = "./Introduction/FileHandling/test.txt";
        String content = """
                I like litchi in fruits
                and
                Burger in junk food
                and
                mountain dew in cold drinks.
                """;
        try(FileWriter writer = new FileWriter(path)){
            writer.write(content);
            System.out.println("File written");
        }catch (FileNotFoundException e){
            System.out.println("couldn't find file location!");
        }catch (IOException e){
            System.out.println("Couldn't write file!");
        }

    }
}
