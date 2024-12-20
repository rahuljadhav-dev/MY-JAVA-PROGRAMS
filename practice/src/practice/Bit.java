package practice;

public class Bit {
	public static void main(String[] args) {
		     int n=21;
		     int pos=2;
		     int bitmask=n<<pos;
		
		     if((bitmask & n)==0) {
			
			System.out.println(bitmask);
			
	}else System.out.println("Bit was one");
		
			System.out.println(2*2/3-1+44);
			
			int p = 8;
			int q = 3;
			
			System.out.println(p++ / q + " " + p);

            int s = 12;
            int t = 5;
            
            System.out.println(s / t + " " + s % t);
            
            System.out.println(10<<3);
            
            System.out.println(15<<4);
            
            int a=10;  
            int b=10;  
            
            System.out.println(a++ + ++a);  
            
            System.out.println(b++ + b++);  
            
            System.out.println(10*10/5+3-1*4/2);  
            
            int x = 5;
            int y = 2;
            
            System.out.println(5+3*2);
            
            int left=256;
            int shift=6;
            int ans=left<<shift;
            int ans2=left>>shift;
            System.out.println(ans);
            System.out.println(ans2);
 
	}

}
