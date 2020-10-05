
public class BinarySearch {
	
	void binarySearch(int[] arr, int key)
	{
		int l= 0;
		int h= arr.length;
		boolean found= false;
		
		while(l<h && !found)
		{
			int mid= (l+h)/2;
			if(key==arr[mid])
			{
				found= true;
				System.out.println("Element found at index: "+mid);
			}
			else if(key<arr[mid])
			{
				h=mid-1;
			}
			else
			{
				l=mid+1;
			}
			
		}
	}

}
