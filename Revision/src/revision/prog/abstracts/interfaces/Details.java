package revision.prog.abstracts.interfaces;

public abstract class Details implements Methods{
	int num1;
	int num2;

	@Override
	public abstract void show(String name) ;
	@Override
	public int show(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		int sum=num1+num2;
		System.out.println("The sum is :"+sum);
		
		return sum;
	}

}
