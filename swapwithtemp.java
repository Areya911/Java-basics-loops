import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
    }
}
