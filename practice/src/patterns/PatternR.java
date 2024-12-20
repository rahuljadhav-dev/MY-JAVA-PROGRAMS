package patterns;

public class PatternR {
	public static void main(String[] args) {
		int r=6;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=r;j++) {
				if(j==1||i==1||i==3||(j==r&&i==2)||(j==2 && i==4)||(j==3 && i==5)||(j==4 && i==6) ){
					System.out.print("*");
				}else
					System.out.print(" ");
			}
			System.out.println();
		}
		 
	}

}
