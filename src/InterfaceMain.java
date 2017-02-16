import java.util.*;
public class InterfaceMain {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value : ");
		int val = sc.nextInt();
		
		OneInterface oi=new ClassOne();
		oi.setNumberValue(val);
		OneInterface oi1=new ClassTwo();
		oi1.setNumberValue(val);
	}

}
