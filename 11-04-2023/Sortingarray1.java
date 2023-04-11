package arrays;
import java.util.*;
public class Sortingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp=0;
		int a[] = {45,75,85,96,12};
		System.out.println("Original array:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
		System.out.println("Choose option: 1)Ascenting 2)Descending");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			for(int i=0; i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]>a[j]) {
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("Sorted array: (Ascending)");
			
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			break;
			
		case 2:
			for(int i=0; i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]<a[j]) {
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("Sorted array: (Decending)");
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			break;
			
		case 3:
			System.out.println("Wromg Choice");
			
		}
	}

}
