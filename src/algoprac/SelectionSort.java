package algoprac;

public class SelectionSort {
	public static int[] selectSort(int[] x) {
		int currMinInd=0;
		int swapValue = x[0];
		for(int i =0;i<x.length;i++) {
			currMinInd=findMinInd(x,i);
			swapValue = x[i];
			x[i]=x[currMinInd];
			x[currMinInd]=swapValue;
		}
		
		return x;
	}
	
	public static int findMinInd(int []list,int startInd) {
		int resInd=startInd;
		for(int i = startInd;i<list.length;i++) {
			if(list[i]<list[resInd]) {
				System.out.println("Min Index: "+i+" Val :"+list[i]);
				resInd=i;
			}
		}
		return resInd;
	}
	public static void main(String args[]) {
		int []test = {4,4,4,3,2,8,6,4,234,62546,1346,99,100,17,1,1,1,1,755,234561,12513,4};
		System.out.print("(");
		for (int i:test)
			System.out.print(i+", ");
		System.out.print(")");
		
		int []res = new int[test.length];
				res= selectSort(test);
		System.out.print("(");
		for (int i:res)
			System.out.print(i+", ");
		System.out.print(")");
		
	}
}
