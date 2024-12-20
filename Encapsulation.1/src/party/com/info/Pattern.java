package party.com.info;

public class Pattern {
	char ch;
	int n;
	
	public Pattern() {
		n=3;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	public Pattern(char c) {
		n=3;
		ch=c;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println(" ");
		}	
	}
	
	public Pattern(char a,int b ) {
		ch=a;
		n=b;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println(" ");
		}
	}
	
	

}
