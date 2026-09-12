class Solution {

    public void setZeroes(int[][] arr, int row, int col) {
        
        
        int m = arr.length;
        int n = arr[0].length;

        for(int r=0;r<m;r++){
            if(arr[r][col] != -1)
                arr[r][col] = 0;
        }

        for(int c=0;c<n;c++){
            if(arr[row][c] != -1)
                arr[row][c] = 0;
        }

        arr[row][col] = 0;

    }

    public void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        boolean row[] = new boolean[m];
        boolean col[] = new boolean[n];
        
        

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i=0;i<m;i++){
            if(row[i] == true){
                for(int c=0;c<n;c++){
                    matrix[i][c] = 0;
                }
            }
        }

        for(int i=0;i<n;i++){
            if(col[i] == true){
                for(int r=0;r<m;r++){
                    matrix[r][i] = 0;
                }               
            }
        }
      

    }
}