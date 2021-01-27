import java.util.*;
public class nqueen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[][]=new int[n][n];
        noofways(ar,0,n);
        System.out.println(qcount);
    }
    public static int qcount=0;
    public static void noofways(int board[][],int row,int n){
 
        if(row==n){
            qcount++;
            return;
        }
        for(int i=0;i<n;i++){       
            if(isSafe(board,row,i,n)){
                board[row][i]=1;
                noofways(board, row+1, n);
                board[row][i]=0;
            }
        }
    }
    public static boolean isSafe(int b[][],int row,int col,int n){
    for(int i=row-1;i>=0;i--){
        if(b[i][col]==1)
        return false;
    }
    for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
        if(b[i][j]==1)
        return false;
    }
    for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
        if(b[i][j]==1)
        return false;
    }
    return true;
    }
}
