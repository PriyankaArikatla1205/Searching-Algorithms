import java.util.Scanner;
public class binarysearch
{
	public static void main(String[] args) {
	    int i,j;
	    Scanner input= new Scanner(System.in);
	    System.out.println("Enter the length of array: ");
	    int n =input.nextInt();
	    int a[]=new int[n];
	    System.out.println("Enter the array elements: ");
	    for(i=0; i<n ;i++){
	    a[i]=input.nextInt();
        }
	    System.out.println("Enter the element to be searched: ");
	    int k=input.nextInt();
	    int count=0;
	    for(i=0;i<n;i++)
	    {
	      
	             if(a[j]==k)
	        {
	           count+=1;
	        
	            
	        }
	        System.out.println(count);
	       
	    }
	    if(i==n)
	    {
	        System.out.println("Element not found");
	    }

	}
}