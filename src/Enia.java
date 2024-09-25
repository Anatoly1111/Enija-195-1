import java.util.Scanner;
// 3адача 195 Эния
public class Enia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int areaPerPanel = A * B;

        int totalArea = N * areaPerPanel * 2;



        int totalSulphide = totalArea;

        System.out.println(totalSulphide);
    }
}
