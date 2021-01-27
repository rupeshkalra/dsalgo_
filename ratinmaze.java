import java.util.*;
public class ratinmaze {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maze[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                maze[i][j]=sc.nextInt();
            }
        }
        boolean [][] vis=new boolean[n][n];
        find(maze,n,0,0,vis);
    }
    static String path="";
    public static void find(int [][] maze,int n,int i,int j,boolean[][] vis){
        if(i==n-1&&j==n-1){
        System.out.println(path);
        return;
        }

        if(!isSafe(maze,n,i,j,vis))
        return;

        vis[i][j]=true;

        if(i+1<n && maze[i+1][j]!=0){
            path+="D ";
            find(maze,n,i+1,j,vis);
            path=path.substring(0,path.length()-1);
        }

        if(j+1<n && maze[i][j+1]!=0){
            path+="R ";
            find(maze,n,i,j+1,vis);
            path=path.substring(0,path.length()-1);
        }

        if(i-1>=0 && maze[i-1][j]!=0){
            path+="U ";
            find(maze,n,i-1,j,vis);
            path=path.substring(0,path.length()-1);
        }
        if(j-1>=0 && maze[i][j-1]!=0){
            path+="L ";
            find(maze,n,i,j-1,vis);
            path=path.substring(0,path.length()-1);
        }
        vis[i][j]=false;
        return;
    }
    public static boolean isSafe(int [][] maze,int n,int i,int j,boolean[][]vis){
        if (i>=n || j>= n ||  i< 0 || j< 0 || vis[i][j])
        return false;
 
        return true;
    }
}
