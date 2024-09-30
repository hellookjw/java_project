import java.util.Scanner;

class Pen {
    String color;
    int thickness; 
    String style;

    public Pen(String color, int thickness, String style) {
        this.color = color;
        this.thickness = thickness;
        this.style = style;
    }
}

public class PenApp {
    public static void main(String[] args) {
        Pen[] pen = new Pen[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < pen.length; i++) {
            System.out.print((i + 1) + "번 펜의 색깔: ");
            String color = scanner.nextLine();
            System.out.print("굵기 : ");
            int thickness = Integer.parseInt(scanner.nextLine());
            System.out.print("스타일 : ");
            String style = scanner.nextLine();
            pen[i] = new Pen(color, thickness, style);
        }

        for (int i = 0; i < 2; i++) {
            System.out.print("펜 번호 입력(1~3) ");
            int penNumber = Integer.parseInt(scanner.nextLine()) - 1;

            if (penNumber >= 0 && penNumber < pen.length) {
                Pen p = pen[penNumber];
                System.out.println((penNumber + 1) + "번 펜: " + p.color + ", " + p.thickness + ", " + p.style);
            } else {
                System.out.println("잘못된 펜 번호입니다.");
            }
        }

        scanner.close();
    }
}