package core_java;

public class Java10_array {
	//initialization of array
	public static void main(String[] args) {
		int[] a1=new int[3];
		a1[0]=10;
		a1[1]=20;
		a1[2]=30;
		
		int[] a2;
		a2=new int[2];
		a2[0]=120;
		a2[1]=200;
		
		int[] a3=new int[] {10,30,40,50};
		for(int i=0;i<a3.length;i++) {
			System.out.println(a3[i]+" ");
		}
		
		for(int x : a3) {
			System.out.println(x+" ");
		}
		
		System.out.println(a1[0]);
		System.out.println(a2[1]);
		System.out.println(a3[3]);
	}

}
