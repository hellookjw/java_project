// Sorter.java
import java.util.Arrays;

public class Sorter {
    private Comparable comparable; // Sorter가 사용할 Comparable 객체??

    // Constructor
    public Sorter(Comparable comparable) {
        this.comparable = comparable;
    }

    // Comparable 객체 설정
    public void setComparable(Comparable comparable) {
        this.comparable = comparable;
    }

    // 버블 정렬 메서드
    public void bubbleSort(Object[] objs) {
        int n = objs.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Comparable 비교
                if (comparable.compare(objs[j], objs[j + 1]) > 0) {
                    // swap
                    Object temp = objs[j];
                    objs[j] = objs[j + 1];
                    objs[j + 1] = temp;
                }
            }
        }
    }
}
