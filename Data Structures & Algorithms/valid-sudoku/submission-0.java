class Solution {
    public boolean isValidSudoku(char[][] board) {
       
        for(int i =0;i<9;i++)
        {
             HashSet<Character> set_row = new HashSet<>();
             HashSet<Character> set_col = new HashSet<>();
             HashSet<Character> set_sq = new HashSet<>();
            for (int j=0;j<9;j++)
            {

                if (board[i][j] !='.'){
                if (set_row.contains(board[i][j])) return false;
                set_row.add(board[i][j]);}

                if (board[j][i]!='.'){
                    if (set_col.contains(board[j][i])) return false;
                set_col.add(board[j][i]);}

                int r = (i/3)*3+(j/3);
                int c = (i%3)*3+(j%3);

                if(board[r][c]!='.'){
                    if(set_sq.contains(board[r][c])) return false;
                set_sq.add(board[r][c]);}

            }
        }

        return true;
        
    }
}
