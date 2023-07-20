import java.util.Arrays;

public class NobleInteger {

    public static int nobleIntegerExists(int[] A) {
        Arrays.sort(A);

        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int currentNumber = A[i];
            int countGreater = n - i - 1;
            if (currentNumber == countGreater) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1, 3};
        int[] arr2 = {1, 1, 3, 3};
        System.out.println("Does there exist a noble integer in arr1? " + (nobleIntegerExists(arr1) == 1));
        System.out.println("Does there exist a noble integer in arr2? " + (nobleIntegerExists(arr2) == 1));
}
}