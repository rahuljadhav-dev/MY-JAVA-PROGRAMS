package practice2;

import java.io.Serializable;

public class MyDetails implements Serializable{
	String name;
	int age;
	transient long ph;
	transient String address;
	String education;




}
