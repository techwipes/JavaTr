package BasicExamples.Exceptions;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.text.ParseException;

public class Except_3 {

    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | ParseException e ) // multi catch
         {
            e.printStackTrace();
        }

    }

    public static void run() throws IOError, IOException, FileNotFoundException, IllegalAccessError, ParseException {

    }
}
