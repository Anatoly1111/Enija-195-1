import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// 3адача 195 Эния
public class Enia {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(new File("INPUT.txt"));

            int N = scanner.nextInt();
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            int areaPerPanel = A * B;

            int totalArea = N * areaPerPanel * 2;


            int totalSulphide = totalArea;

            System.out.println(totalSulphide);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}
