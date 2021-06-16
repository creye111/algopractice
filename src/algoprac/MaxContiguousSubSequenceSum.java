package algoprac;

public class MaxContiguousSubSequenceSum {
	private static int maxSumRecLinear(int [] a, int left, int right) {
		
	}
	private static int maxSumRecLog(int []a, int left, int right) {
		if(left==right)
			if(a[left]>0)
				return a[left];
			else
				return 0;
		int center = (left + right)/2;
		int maxLeftSum = maxSumRecLog(a,left,center);
		int maxRightSum = maxSumRecLog(a,center+1,right);
		
		int maxLeftBorderSum =0, leftBorderSum =0;
		for(int i =center;i>=left;i--) {
			leftBorderSum +=a[i];
			if(leftBorderSum > maxLeftBorderSum) {
				maxLeftBorderSum = leftBorderSum;
			}
		}
		
		int maxRightBorderSum=0,rightBorderSum=0;
		for(int i = center +1;i<=right; i++) {
			rightBorderSum += a[i];
			if(rightBorderSum > maxRightBorderSum) {
				maxRightBorderSum = rightBorderSum;
			}
		}
		return max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);
		
	}
	public static int maxSubSum3(int []a) {
		return maxSumRecLog(a,0,a.length-1);
	}

}
