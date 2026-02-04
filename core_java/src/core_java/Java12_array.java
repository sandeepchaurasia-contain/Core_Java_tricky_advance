package core_java;
//import java.util.Scanner;
public class Java12_array {
	public static void main(String[] args) {
		int[][] arr3={
				{10,20,30},
				{40,50,60}
		};
		System.out.println(arr3.length);
		System.out.println(arr3[0].length);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
