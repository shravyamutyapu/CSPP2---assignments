import java.util.*;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{   
		System.out.println("Enter n of array : ");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int arr[];

		arr = new int[n];
		for(int i=0;i<n;i++){

     	arr[i]=new Scanner(System.in).nextInt();
        }
        int temp = arr[0];
        for(int i=0;i<n;i++){
        	if(arr[i]>temp){
        		temp = arr[i];
        	}
        
        }
        System.out.println(temp);

	}
}
