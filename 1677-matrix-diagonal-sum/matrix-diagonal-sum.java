class Solution {
    public int diagonalSum(int[][] mat) {
        int PD = 0;  //Primary diagonal
        int SD = 0;  //Secondary diagonal
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==j){
                    PD+=mat[i][j];
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==j){
                    continue;
                } else if (i+j == n-1) {
                    SD+=mat[i][j];
                }
            }
        }
        int TD = PD+SD;
        // System.out.println(TD);
        return TD;
    }
    
}