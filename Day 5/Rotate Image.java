class Solution {
    static void swap(int[][] arr, int i, int j) {
      int temp=arr[i][j];
      arr[i][j]=arr[j][i];
      arr[j][i]=temp;
    }
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        int m= matrix[0].length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j<i; j++) {
               swap(matrix,i,j);
            }
        }
        
        int left=0,right=n-1;
        while(left<right) {
        for(int i=0;i<n;i++) {
            int temp=matrix[i][left];
            matrix[i][left]=matrix[i][right];
            matrix[i][right]=temp;    
        }
        left++;
        right--;
       }
    }
}
    