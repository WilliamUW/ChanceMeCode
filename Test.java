
import java.io.*;
import java.util.*;
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String[] args) {
        Applicant a = new Applicant();
        Scanner in = new Scanner(System.in);
        System.out.println("What is your program group? (1-3)");
        a.setProgramGroup(Integer.parseInt(in.nextLine()));
        System.out.println("What is your high school average? (0-100)");
        a.setAverage(Double.parseDouble(in.nextLine()));
        System.out.println("What is your high school adjustment factor? (9.9-27.1; 16.1 is average)");
        a.setAdjustmentFactor(Double.parseDouble(in.nextLine()));
        System.out.println("What is your estimated AIF score? (0-5; average is 2)");
        a.setAIFScore(Double.parseDouble(in.nextLine()));
        System.out.println("What is your estimated interview score? (0-3; average is 2)");
        a.setInterviewScore(Double.parseDouble(in.nextLine()));
        System.out.println("Calculating...");
        System.out.println("One second");        
        a.calculateChance();
        a.returnPrograms();
        a.returnAdjustedAverage();
        a.returnRealAdjustedAverage();
        a.returnChance();
    }
}
