import java.util.Scanner;

public class ColumnSum {
    public static void collsum(int[][] mat,int rowsize,int colsize){
        for(int j=0;j<rowsize;j++) {
            int sum = 0;

            for (int i = 0; i < colsize; i++) {
                sum += mat[i][j];
            }
            System.out.println(sum);
        }

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int rowsize=scan.nextInt();
        int colsize=scan.nextInt();
        int mat[][]=new int[rowsize][colsize];
        for(int i=0;i<rowsize;i++){
            for (int j=0;j<colsize;j++){
                mat[i][j]=scan.nextInt();
            }
        }
        collsum(mat,rowsize,colsize);

    }
}
