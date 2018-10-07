import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class FindCommon {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter total number of files");
	int i =0;
	ArrayList<String> ar1= new ArrayList();
	ArrayList<String> ar2= new ArrayList();
	ArrayList<String> ar3= new ArrayList();
	HashSet<String> out= new HashSet();
	try {
	 i =Integer.parseInt(input.nextLine());
	}catch(Exception e) {
		System.out.println("Wrong number entered");
	}
	
	String[] path = new String[i];
	if(i== 3) {
	for(int j =0;j<i;j++) {
		
	System.out.println("Enter path(s) of text files to be read");
	
	path[j] = input.nextLine();
	}
	if( path.length ==3) {
		ReadFile rd = new ReadFile();
		
		try {
			ar1= rd.load((String)path[0]);
		
		ar2= rd.load((String)path[1]);
		ar3= rd.load((String)path[2]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out=rd.findCommon(ar1, ar2, ar3);
		System.out.println("common words");
		for(String s :out) {
			System.out.println(s);
		}
		
	}

	}else {
		
		System.out.println("Number of files cannot be greater than 3");
	}
	
	}
}
