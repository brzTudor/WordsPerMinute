import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMProgram {

    static String[] words = {"envelope", "hammer", "the", "hello", "world", "microphone", "cars", "mercedes",
            "dogs", "cats", "and", "boots", "sleeping", "zebra", "telephone", "random", "java", "welcome",
            "carbonara", "wednesday", "worchestershire", "california", "programming", "kilograms", "mathematics"};
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) throws InterruptedException {

        System.out.println("**** 3 ****");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("**** 2 ****");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("**** 1 ****");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("**** GO ****\n");

        Random rand = new Random();
        // how many words to type
        for(int i=0; i<12; i++){
            System.out.print(words[rand.nextInt(words.length)] + " ");
        }

        double start = LocalTime.now().toNanoOfDay();

        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        String typed = sc.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        double timeElapsed = end - start;
        double seconds = timeElapsed / Math.pow(10, 9);
        System.out.println("\n - Time elapsed: " + df.format(seconds));
        int charNum = typed.length();
        int wpm = (int) ((((double) charNum / 8) / seconds) * 60);

        System.out.println(" - Words typed: " + typed);
        System.out.println(" - Your wpm is: " + wpm);
    }
}
