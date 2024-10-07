import java.util.Scanner;

public class dBmCalculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("전압을 입력하세요: ");
        double volts = scanner.nextDouble();

        System.out.print("저항을 입력하세요: ");
        double resistance = scanner.nextDouble();

        double power = volts * volts / resistance;
        System.out.println("전력은 " + power + "와트");
        double mW = power * 1000;

        double dBmFrommW = 10*Math.log10(mW);
        double dBmFromW = 10*Math.log10(power) + 30;
        System.out.println("dBm은: " + dBmFrommW);
        System.out.println("dBm은: " + dBmFromW);

        scanner.close();




    }
}