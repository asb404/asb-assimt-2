
import java.util.*;

public class missing {
	static int findnum(int a[], int n) {
		// assuming only 1 element is missing
		int i, value;
		value = (n + 1) * (n + 2) / 2;
		for (i = 0; i < n; i++)
			value -= a[i];
		return value;
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
		int ans = findnum(arr, n);
		System.out.println("Value missing in the array :" + ans);
		sc.close();
	}
}
