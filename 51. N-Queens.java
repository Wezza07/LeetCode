class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        Backtracking(new int[n][n] , 0 , n , new HashSet<>() , new HashSet<>() , new HashSet<>());
        return res;
    }
    public void Backtracking(int[][] board , int i , int n, Set<Integer> d1 , Set<Integer> d2 , Set<Integer> c){
        if(i==n){
            adding(board);
            return;
        }
        for(int j=0 ; j<n ; j++){
            if(!d1.contains(i+j) && !d2.contains(j-i) && !c.contains(j)){
                board[i][j] = 1;
                d1.add(i+j);
                d2.add(j-i);
                c.add(j);
                Backtracking(board , i+1 , n , d1 , d2 , c);
                board[i][j] = 0;
                d1.remove(i+j);
                d2.remove(j-i);
                c.remove(j);
            }
        }
    }
    public void adding(int[][] board){
        List<String> temp = new ArrayList<>();
        for(int i=0 ; i<board.length ; i++){
            String s = "";
            for(int j=0 ; j< board.length ; j++){
                if(board[i][j] == 1) s+='Q';
                else s+='.';
            }
            temp.add(s);
        }
        res.add(temp);
    }
}
