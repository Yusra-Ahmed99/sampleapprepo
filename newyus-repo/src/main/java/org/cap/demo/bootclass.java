package org.cap.demo;

public class bootclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("HELLOOO");
show();
	}
public static void show()
{   int[] arr= {1,2,3,4};
    int sum=0;
    for(int i=0;i<=10;i++)
    {
    	System.out.println(arr[i]);
    	sum+=i;
    }
	System.out.println(sum);
}
}
