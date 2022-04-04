import java.util.*;

class Palindrome{
	public static void main(String[] args) {
		//object and scanner declaration
		Scanner scn=new Scanner(System.in);
		binaria bnobj=new binaria();

		int num;//a number to test
		String bin;// a string to store translated binary
		//attempting a user to type in the number he wants
		System.out.println("type in the number you want to check for palindromity");
		//storing a number in the variable 
		num=scn.nextInt();
		//use of object to transform a number into a binary
		bin=bnobj.binator(num);
		//storing a reversed binary value
		String reversed=bnobj.reversor(bin);
		// if condition to compare an actial binary (bin) and reversed binary. if equla it means they are palindrome else it not
		if (bin.equals(reversed)) {
			
		System.out.println(" \n the Binary value of "+num+" is "+bin+". and it's reverse form is "+reversed+" so it is a Palindrome");
		}
		else{
			System.out.println("\n "+num+" is not a Palindrome. because it's binary value is "+bin+" and its's reverse value is "+reversed);


	}
}
}
 
//a class that is going to deal with binary numbering
 class binaria{
 	// a method that changes a number into a binary
 	public String binator(int number1){
 		return Integer.toBinaryString(number1);
 	}
 	// a method that reverses a string
 	public String reversor(String rev){

		StringBuilder stb=new StringBuilder(rev);
		stb.reverse();
		return stb.toString();
 	}
 }
 // remember this way is done using built-in string functions no loops used. 
 // but you're suposed to know about it. and this is the simple and  understable way of doing our work