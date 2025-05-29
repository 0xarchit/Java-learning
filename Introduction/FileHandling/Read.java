package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class Read {
    public static void main(String[] args){
        String path = "./Introduction/FileHandling/test.txt";


        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("Can't locate file path");
        }catch (IOException e){
            System.out.println("something went wrong");
        }finally {

        }

    }
}
