import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("整数を入力してください: ");
            int num = Integer.parseInt(scanner.nextLine());
            int result = 100 / num;
            System.out.println("100 を " + num + " で割った結果は " + result + " です");
        } catch (ArithmeticException e) {
            // 0で割った場合
            System.out.println("エラー: 0 で割ることはできません");
        } catch (NumberFormatException e) {
            // 数値以外の入力があった場合
            System.out.println("エラー: 整数を入力してください");
        }
        scanner.close();
    }
}