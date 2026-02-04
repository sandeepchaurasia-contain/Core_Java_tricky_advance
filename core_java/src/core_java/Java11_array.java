package core_java;
import java.util.Scanner;


public class Java11_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size _ -  : ");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("enter array:-");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		
		}
		
		System.out.println("my  sum of array :---");
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			sum+=arr[i];
		}
		System.out.println("sum of  array :-"+sum);
		
		System.out.println("\n");
		
		
		
		System.out.println("Enter the size 2 _ -  : ");
		int size1=sc.nextInt();
		
		int[] arr1=new int[size1];
		System.out.println("enter array 2:-");
		for(int i=0;i<size1;i++) {
			arr[i]=sc.nextInt();
		}
			
	
		//int[] arr1=new int[] {10,30,20,43,3};
		int max=arr1[0];
		for(int j=0;j<arr1.length;j++) {
			if(arr1[j]>max) {
				max=arr1[j];
			}
		}
		System.out.println("max value :- "+max);
			
		
		
		 int min=arr1[0];
		 for(int i=0;i<arr1.length;i++)
		 {
		 		if(arr1[i]>min){
		 
		  			System.out.println("minimum value is :-  "+min);
		  		}
		 		
		 }
		 
		 System.out.println("reverse array:-----");
		 
		 int[] arr2=new int[] {10,20,30,40};
		 
		  for(int i=arr2.length-1;i>=0;i--) {
			  System.out.print(arr2[i]+" ");
		  }
		 
		
		
		
		
		
		
		
	}
}
