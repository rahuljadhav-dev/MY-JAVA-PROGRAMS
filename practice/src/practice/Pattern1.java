package practice;
public class Pattern1 {
	public static void main(String[] args) {
		int row=5;
		int col=5;
		for(int i=1;i<row;i++) {
			for(int j=row;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1; i <= row; i++) {
			// Print spaces
			for (int j = 1; j < row; j++) {
				System.out.print("  ");
			}

			// Print stars
			for (int k = i; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for(int i=0;i<row;i++) {
			for(int j=row;j>i+1;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i*2;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=row; i>0;i--) {
			for(int j=row;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}



	}

}
