package strings;

public class Pg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Raj is handsome";
        char[] c=s.toCharArray();	
        int count=0;
        for(int i=0;i<c.length;i++) {
        	if(c[i]!=' ')
        		count++;
        		
        }
        System.out.println("The length of String is:"+count);
	}

}
