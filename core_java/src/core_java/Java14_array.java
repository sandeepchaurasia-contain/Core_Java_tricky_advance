package core_java;

public class Java14_array {
	public static void main(String[] args) {
		int[][] a= {
				{10,30,28}
			   ,{40,50,60}
		};
		
		int row=a.length;
		int col=a[0].length;
		
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
		
		
	}
}
