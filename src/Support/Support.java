package Support;

import java.util.Scanner;

public class Support {
    public static Double inputDouble(Scanner scan, String inputText, String errorText){
        double temp = -1.0;
        System.out.println (inputText);
        boolean error = false;
        try{
            temp = Double.parseDouble (scan.nextLine ());
        }
        catch (NumberFormatException numberFormatException){
            error = true;
        }
        while (error){
            System.out.println (errorText);
            try{
                temp = Double.parseDouble (scan.nextLine ());
                error = false;
            }
            catch (NumberFormatException ignored){
            }
        }
        return temp;
    }
}
