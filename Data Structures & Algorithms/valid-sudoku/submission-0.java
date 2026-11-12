class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] colm = new HashSet[9];
        HashSet<Character>[] sqr = new HashSet[9];
        for(int i=0;i<9;i++)
        {
            rows[i]=new HashSet<>();
        }
        for(int i=0;i<9;i++)
        {
            colm[i]=new HashSet<>();
        }
        for(int i=0;i<9;i++)
        {
            sqr[i]=new HashSet<>();
        }
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if(!rows[i].add(board[i][j]))
                {
                    return false;
                }
                if(!colm[j].add(board[i][j]))
                {
                    return false;
                }
                int index = (i/3)*3 + j/3;
                if(!sqr[index].add(board[i][j]))
                {
                    return false;
                }
                }
            }
        }
        return true;
 
    }
}
