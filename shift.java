import java.util.Scanner;
public class shift {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i, ncount=0,pcount=0;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter value :");
			arr[i]=sc.nextInt();
		}
		System.out.println("Given array is :");
		for(i = 0; i < n; i++) 
		   System.out.print(" "+arr[i]);
		System.out.println("");
		for(i = 0; i < n; i++) 
		{
		if(arr[i]<0)
			arr[ncount++]=arr[i];
		}
		pcount=ncount;
		for(i=0;i<n;i++)
		{
		    if(arr[i] > 0)
		    	arr[pcount++] = arr[i];
		}
		for(i=pcount;i<n;i++)
		   arr[i] = 0;
		System.out.println("Organized Array is :");
		for(i = 0; i < n; i++) 
		   System.out.print("  "+arr[i]);
		}
	}