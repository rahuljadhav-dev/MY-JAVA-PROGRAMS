package revision.until.now;

public class DataTypes {
	int id;
	String name;
	
	public DataTypes(int a,String b) {
		id=a;
		name=b;
		System.out.println("The name is:"+name+"\n"+"ID :"+id+"\n");
		
	}
	public void Calc(int a,int b) {
		int sum=a+b;
		System.out.println("The sum is :"+sum+"\n");
		
	}
	
	public int Calcc(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("sum of three num :"+sum+"\n");
		return sum;
	}
	
//	public void loop(int a) {
//		for(int i=2;i<a;i++) {
//			if(a%i==0) {
//				System.out.println(a+" is Not prime"+"\n");
//				
//			}
//		}
//		System.out.println(a+" is  prime"+"\n");
//	}
	
	public void condit(int a) {
		if(a>=18) {
			System.out.println("you are eligible for vote"+"\n");
		}else
			System.out.println("you are not eligible for vote"+"\n");
	}
	
	public void Sw(int button) {
		switch(button) {
		case 1:System.out.println("Sun");
		break;
		case 2:System.out.println("Mon");
		break;
		case 3:System.out.println("Tue");
		break;
		case 4:System.out.println("Thu");
		break;
		case 5:System.out.println("Wed");
		break;
		case 6:System.out.println("Fri");
		break;
		case 7:System.out.println("Sat");
		break;
		default:System.out.println("invalid input");
		
		}
		
	}
	
	public void Pal(int num) {
		int i=0;
		int temp=num;
		int store=0;
	
		while(num>i) {
			store=store*10+num%10;
			num/=10;
			
			
		}
		if(temp==store) {
			System.out.println(temp+" its palindrome"+"\n");
		}else
			System.out.println(temp+" its not palindrome"+"\n");
	}
			
	public void Fact(int a) {
		int temp=1;
		for(int i=1;i<=a;i++) {
			temp*=i;
		}
		System.out.println("Factorial of "+a+" is :"+temp+"\n");
	}
	
	public void Mul(int a) {
	int mul=0;
	int i=1;
	do{
		System.out.println(a+"X"+i+"="+(a*i)+"\n");
		i++;
		
	}
	while(i<=10);
	}
	
	public void Check(int a) {
		if(a>0) {
			System.out.println(a+" is positive number"+"\n");
		}else
			System.out.println(a+" is negative number"+"\n");
	}
	
	public static void main(String[] args) {
		DataTypes call=new DataTypes(123,"Rahul");
		DataTypes call1=new DataTypes(124,"Shubham");
		DataTypes call2=new DataTypes(125,"Nikhil");
		DataTypes call3=new DataTypes(126,"Rohit");
		DataTypes call4=new DataTypes(127,"Vansh");
		DataTypes call5=new DataTypes(128,"Omkar");
		DataTypes call6=new DataTypes(129,"Harish");
		DataTypes call7=new DataTypes(130,"Madhav");
		DataTypes call8=new DataTypes(131,"Rajesh");

		call.Calc(50, 50);
		call.Calc(400,30 );
		call.Calc(599,111 );
		call.Calc(77,88 );
		call.Calc(403,304 );
		
		call.Calcc(14, 15,16);
		call.Calcc(17, 17,196);
		call.Calcc(19, 43,66);
		call.Calcc(56, 23,56);
		call.Calcc(94, 83,96);
		
//		call.loop(13);
//		call.loop(14);
//		call.loop(15);
//		call.loop(16);
//		call.loop(17);
		
		call.condit(17);
		call.condit(18);
		call.condit(19);
		call.condit(20);
		call.condit(21);
		
		call.Sw(10);
		call.Sw(11);
		call.Sw(12);
		call.Sw(13);
		call.Sw(14);
		
		call.Pal(131);
		call.Pal(136);
		call.Pal(141);
		call.Pal(136);
		call.Pal(137);
		
		call.Fact(7);
		call.Fact(8);
		call.Fact(9);
		call.Fact(10);
		call.Fact(11);
		
		call.Mul(15);
		call.Mul(16);
		call.Mul(17);
		call.Mul(18);
		call.Mul(19);
		
		call.Check(12);
		call.Check(13);
		call.Check(14);
		call.Check(15);
		call.Check(16);
		
		
//		System.out.println(Byte.MAX_VALUE);
//		System.out.println(Byte.MIN_VALUE);
//		System.out.println(Short.MAX_VALUE);
//		System.out.println(Short.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Long.MIN_VALUE);
//		System.out.println(Float.MAX_VALUE);
//		System.out.println(Float.MIN_VALUE);
//		System.out.println(Double.MAX_VALUE);
//		System.out.println(Double.MIN_VALUE);
//		System.out.println(Character.MAX_VALUE);
//		System.out.println(Character.MIN_VALUE);
//		System.out.println(Boolean.FALSE+""+Boolean.TRUE);
		
	
		
		
		
	}

}
