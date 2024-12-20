package practice;

public class Numericals {

	//Numericals on Foundation Engineering
	public static void main(String[] args) {
		int x = 5;
		System.out.println(x++ + ++x - x--);
		
		int a = 10;
		int b = 5;
		System.out.println((a++ * --b) + (++a / b--));
		
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 > 5 && num2 < 30 || num1 + num2 == 30);
		
		int s = 5;
		int t = 2;
		System.out.println(s<<t++ - ++t);
		
		int numm=36;
		int numm1=63;
		System.out.println(numm/numm1);
		System.out.println(numm1%numm);





//1.Determine the lenght of pile to carry the load
		
		int C=25;
		int Qu=500;
		float De=0.6F;
		float $=0.9F;
		float Fs=2.5F;
		int S=1;
		float A=3.141F*De;		
		float ans1=($*S*C);
		float ans2=(A);
		float finalanswer=500/(ans1*ans2);
		
		System.out.println("Length of pile Dp "+ "=" + finalanswer);
		
//2.Determine the elastic settlement of square footing 
		int Q=2250;
		float B=1.5F;
		float D=1.0F;
		int Es=50000;
		float u=0.25F;
		float Is=0.82F;
		float q=Q/(B*B);
		float Si1=q*B;
		float Ans=Si1*0.00001875F*Is;
		
		System.out.println(Ans);
		
		char _$NaMe='R';
		
		System.out.println(_$NaMe);
		
		int xx=50;
		int xy=5;
		int div=50*5/50-5;
		int div1=(50*5)/(50-5);
		
		System.out.println(div);
		System.out.println(div1);
		
		double zx=445.4545;
		
		String Name="Rahul J"; 
		xy=76;
		Name="Ashu";
		
		System.out.println(Name);
		System.out.println(xy);
//3.
		
	}

}
