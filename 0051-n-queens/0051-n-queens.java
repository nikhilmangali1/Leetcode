class Solution {
    private List<List<String>> ans = new ArrayList<>();
    private List<String> board = new ArrayList<>();
    public boolean isSafe(int row,int col,int n){
        int dupRow = row;
        int dupCol = col;
        while(row>=0 && col>=0){
            if(board.get(row).charAt(col)=='Q'){
                return false;
            }
            row--;
            col--;
        }
        row = dupRow;
        col = dupCol;
        while(col>=0){
            if(row>=0 && row < n && board.get(row).charAt(col)=='Q'){
                return false;
            }
            col--;
        }
        row = dupRow;
        col = dupCol;
        while(row<n && col>=0){
            if(board.get(row).charAt(col)=='Q'){
                return false;
            }
            row++;
            col--;
        }
        return true;
    }
    public void solve(int col,int n){
        if(col == n){
            ans.add(new ArrayList<>(board));
            return;
        }
            for(int row = 0;row<n;row++){
                if(isSafe(row,col,n)){
                    StringBuilder newRow = new StringBuilder(board.get(row));
                    newRow.setCharAt(col,'Q');
                    board.set(row,newRow.toString());
                    solve(col+1,n);
                    newRow.setCharAt(col,'.');
                    board.set(row,newRow.toString());
                }
            }
        }
    public List<List<String>> solveNQueens(int n) {
        for(int i = 0;i<n;i++){
            char[] row = new char[n];
            Arrays.fill(row,'.');
            board.add(new String(row));
        }
        solve(0,n);
        return ans;
    }
}