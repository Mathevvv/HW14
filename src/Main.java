import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        String value = String.valueOf(num);
        int avar = 0;
        for (int i = 0; i < value.length(); i++) {
            avar += Integer.parseInt(String.valueOf(value.charAt(i)));
        }
        return (double) avar/value.length();
    }
}
