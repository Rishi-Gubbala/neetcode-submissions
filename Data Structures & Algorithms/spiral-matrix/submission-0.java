class Solution {
    static void recur(int top,int down,int left,int right,List<Integer> result , int[][] matrix)
    {
        if(top>down || left>right) return;
        for(int i=left;i<=right;i++)
        {
            result.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=down;i++)
        {
            result.add(matrix[i][right]);
        }
        right--;
        if(top<=down)
        {
            for(int i=right;i>=left;i--)
            {
                result.add(matrix[down][i]);
            }
            down--;
        }
        if(right>=left)
        {
            for(int i=down;i>=top;i--)
            {
                result.add(matrix[i][left]);
            }
            left++;
        }
        recur(top,down,left,right,result,matrix);
        return ;
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top=0;
        int left =0;
        int right = matrix[0].length-1;
        int down = matrix.length-1;
        recur(top,down,left,right,result,matrix);
        return result;
    }
}
