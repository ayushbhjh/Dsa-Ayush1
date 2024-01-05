public class transpose {
public static void main(String args[]){
  int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
  transposematrix(matrix);

}
public static void transposematrix(int [][]matrix){
  int m = matrix.length;
  int n = matrix[0].length;
  int [][] transpose= new int [n][m];
  for(int i =0; i<m; i++){
    for(int j =0; j<n; j++){
      transpose[j][i]=matrix[i][j];
    }
  } 
  System.out.println("transpose matrix");
  for(int i =0; i<n; i++){
    for(int j=0; j<m; j++){
      System.out.print(transpose[i][j]);
    }
    System.out.println();
  }
} 
}