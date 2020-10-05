
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {5,6,12,34,56,3,7,43,1};
		int val=34;
		linerSearch(arr,val);
		
		int[] sortedArr= new int[] {1,2,4,6,8,13,16,23,27,35,38,39,45,67,89};
		BinarySearch bs= new BinarySearch();
		bs.binarySearch(sortedArr, 35);

	}
	
	
	static void linerSearch(int[] arr,int val)
	{
		int i;
		int n= arr.length;
		boolean found= false;
		for(i=0;i<n; i++) {
			if(arr[i] == val)
			{
				found= true;
				break;
			}
		}
		if(found)
			System.out.println(val+" found at index "+i);
		else
			System.out.println(val+" not found in the given array");
	}

}
