package comparable.demo2;

public class Animal implements Comparable<Animal>{
	String name;
	int ht;
	public Animal(String name,int ht) {
		this.name=name;
		this.ht=ht;
		
	}
	@Override
	public String toString() {

		return name+" :"+ht ;
	}
	@Override
	public int compareTo(Animal o) {
		if(this.ht==o.ht)
			return 0;
			
			else if(this.ht>o.ht)
				return 1;
			else
				return -1;
		
		
	}

}
