package pw.theo.chicken;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NameScanner
{
    public static String scanFileContents( File file ) throws FileNotFoundException
    {

        String content = "";

        Scanner forParkour = new Scanner( file );

        while ( forParkour.hasNextLine( ) )
        {
            content += forParkour.nextLine( );

            content += "\n";
        }

        String fileContents = content;

        return fileContents;
    }

    public static String[] arrayThatBitch(String s){

        return s.split("\n");
    }
}

