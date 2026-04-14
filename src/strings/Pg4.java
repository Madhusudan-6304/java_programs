package strings;

import java.util.Arrays;

public class Pg4 {
	public static void bubblesort(char arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="deepika";
		char[] ch=s.toCharArray();
		bubblesort(ch);
		System.out.println("The Characters after sorting:");
		System.out.println(Arrays.toString(ch));
		

	}

}
