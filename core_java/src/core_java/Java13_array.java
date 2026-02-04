package core_java;
import java.util.Scanner;
public class Java13_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter size of row :-");
		int row=sc.nextInt();
		System.out.println("enter size of column :-");
		int col=sc.nextInt();
		
		System.out.println("enter the array elements:- ");
		int[][] arr=new int[row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
			{

				arr[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("print  .................");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
			{

				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
