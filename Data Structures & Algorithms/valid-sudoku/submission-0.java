class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                    continue;
                else if(!set.contains(board[i][j]))
                    set.add(board[i][j]);
                else
                    return false;
            }
            set = new HashSet<>();
        }
        
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[j][i]=='.')
                    continue;
                else if(!set.contains(board[j][i]))
                    set.add(board[j][i]);
                else
                    return false;
            }
            set = new HashSet<>();
        }
        
        for(int i=0;i<9;i+=3)
        {
            for(int j=0;j<9;j+=3)
            {
                for(int x=i;x<i+3;x++)
                {
                    for(int y=j;y<j+3;y++)
                    {
                        if(board[x][y]=='.')
                            continue;
                        else if(!set.contains(board[x][y]))
                            set.add(board[x][y]);
                        else
                            return false;
                    }
                }
                set = new HashSet<>();
            }
        }
        return true;
    }
}
