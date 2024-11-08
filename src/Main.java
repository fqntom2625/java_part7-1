import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> rainfall = new Vector<>();
        int sum = 0;

        while (true) {
            System.out.print("강수량 입력 (0 입력시 종료) >> ");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            rainfall.add(input);
            sum += input;

            for (int rain : rainfall) {
                System.out.print(rain + " ");
            }
            System.out.println();

            double average = sum / (double) rainfall.size();
            System.out.printf("현재 평균 %.1f\n", average);
        }

        scanner.close();
    }
}
