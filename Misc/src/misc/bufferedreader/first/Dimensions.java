package misc.bufferedreader.first;

import java.util.Arrays;

public class Dimensions {
	public static void main(String[] args) {
		//2D array
		int num1[][]= {{11,22,33,44,55,66,77,88,99},{2,4,6,8,10},{21,31,41,51,61,71,81,91}};
		//		System.out.println(num1[2][2]);

		//3D array
		int num2[][][]= { {{1,2,3,4},{3,4,5,6},{6,77,8,9}},{{10,20,30,40},{31,42,51,26},{64,377,668,59}},
				{{10,20,30,40},{30,40,50,60},{60,770,80,90}},{{100,200,300,400},{310,420,510,260},{640,3770,6680,590}}	};
		System.out.println(num2[3][2][3]);
		int sum=0;

		System.out.println(num2[1][1][0]);
				for(int i=0;i<num2.length;i++) {
					for(int j=0;j<num2[i].length;j++) {
						for(int k=0;k<num2[i][j].length;k++) {
							if(num2[i][j][k]%2==0) {
								System.out.println("Even number :"+num2[i][j][k]);
								sum+=num2[i][j][k];	
							}else
								System.out.println("Odd number :"+num2[i][j][k]);
						}	
					}
				}
				System.out.println("Sum of even :"+sum);


	}

}
