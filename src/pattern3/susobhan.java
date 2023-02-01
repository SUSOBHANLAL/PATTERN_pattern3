package pattern3;

public class susobhan {
	public static void main(String args[]) {
		int n =5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int k=n;k>=i;k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		for(int i=n-1;i>=1;i--) {
			
			
			for(int k=n;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
