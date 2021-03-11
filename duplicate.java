
import java.util.*;

public class duplicate {
    static void countdup(int arr[], int n) {
        for (int i = 0; i < n; i++) {

            int indx = arr[i] % n;
            arr[indx] += n;

        }
        for (int i = 0; i < n; i++) {
            if ((arr[i] / n) >= 2)
                System.out.print(i + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The duplicate elemets in the array : ");

        countdup(arr, n);
        sc.close();
    }
}
