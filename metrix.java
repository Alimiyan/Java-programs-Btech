import java.util.Scanner;
public class metrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size");
        int m=s.nextInt();
        int n=s.nextInt();
        int[][] a=new int[m][n];
        System.out.println("enter the first matrix");
        int[][] b=new int[m][n];
        int[][] c=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=s.nextInt(); 
            }
        }
        System.out.println("enter the second matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[i][j]=s.nextInt(); 
            }
        }
        System.out.println("product of the matrix is = ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                c[i][j]=a[i][j]*b[i][j];
                continue;
            }
            continue;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(c[i][j]);
            }
        }
    }
}
