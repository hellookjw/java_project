import java.util.Scanner;

class Die {
    private final int MAX=6; // 주사위의 면 값
    private int faceValue;

    public Die() {
        faceValue=1;
    }

    public int roll() {
        faceValue = (int)(Math.random()*MAX) + 1; // 1부터 6까지의 값을 반환
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue; // 현재 주사위의 면 값을 반환
    }

    public void setFaceValue(int value) {
        faceValue=value;
    }
    

    @Override
    public String toString() {
        String result= Integer.toString(faceValue);
        return result;
    }   
}
public class RollingDice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주사위 던질 횟수를 입력하세요: ");
        int rolls = scanner.nextInt();

        Die die1 = new Die();
        Die die2 = new Die();
        int countGreaterThanEight = 0;

        for (int i=0; i<rolls; i++){
            int sum = die1.roll() + die2.roll(); // 주사위의 합 계산
            
            if (sum > 8) {
                countGreaterThanEight++;
            }

            // 결과 출력
            System.out.println("Roll " + (i + 1) + ": Die One: " + die1 + ", Die Two: " + die2 + ", Sum: " + sum);
        }

        // 합이 8보다 큰 경우 출력
        System.out.println("합이 8보다 큰 경우: " + countGreaterThanEight + "번");

        scanner.close(); // Scanner 객체 닫기
        
    }
}
