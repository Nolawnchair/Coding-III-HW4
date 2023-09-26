/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
		int[][] array = {{10, 12}, {14, 16}};
		MatrixSearch(array, 16);
		
	}
	
	public static void MatrixSearch(int[][] arr, int key)
	{
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        
        while(high >= low)
        {
            mid = (high + low) / 2;
            if(key < arr[mid][0])
            {
                high = mid - 1;
            }
            else if(key > arr[mid][arr[mid].length - 1])
            {
                low = mid + 1;
            }
            
            else
            {
                int low2 = 0;
                int high2 = arr[mid].length - 1;
                int mid2 = 0;
                
                while(high2 >= low2)
        		{
        		    mid2 = (high2 + low2) / 2;
        		    if(arr[mid][mid2] < key)
        		    {
        		        low2 = mid2 + 1;
        		        
        		    }
        		    else if(arr[mid][mid2] > key)
        		    {
        		        high2 = mid2 - 1;
        		    }
        		    else
        		    {
        		         System.out.println(key + " found at " + "[" + mid + ", " + mid2 + "]");
        		         return;
        		    }
        		    
        		    
        		}
            }
        }
        
            
        
        
        
        
        System.out.println("Element not found");
        return;
    }
}






