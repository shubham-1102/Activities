package arrays;
import java.util.*;

public class Sortingarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the elements of array");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Sorting elements of array in Assending order");
		Arrays.sort(arr1);
		for(int var :arr1) {
			System.out.println(var + " ");
		}
		System.out.println();
		Integer arr2[] = {100,34,56,77,93};
		System.out.println("Sorting elements of array in Assending order");
		Arrays.sort(arr2,Collections.reverseOrder());
		for(int var :arr2) {
			System.out.println(var + " ");
		}
	}

}
