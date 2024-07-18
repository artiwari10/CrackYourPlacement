class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> ans = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return ans;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int x = 0, y = 0, dx = 1, dy = 0;
        int totalElements = rows * cols;
        for(int i= 0; i<totalElements;i++) {
            ans.add(matrix[y][x]);
            matrix[y][x] = Integer.MIN_VALUE;
            if(!(0 <= x + dx && x + dx < cols && 0 <= y + dy && y + dy < rows) 
            || matrix[y + dy][x + dx] == Integer.MIN_VALUE) {
                int temp = dx;
                dx = -dy;
                dy = temp;
            }
            x +=dx;
            y +=dy;
        }
        return ans;
    }
}