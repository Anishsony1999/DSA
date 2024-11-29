import java.io.*;
class Matrix
{
    int m[][];
    int row;
    int col;
    Matrix(int row,int col)
    {
        this.row=row;
        this.col=col;
        this.m=new int[row][col];
    }
    BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
    public void read()
    {
        try
        {
            for(int i=0;i<this.row;i++)
            {
                for(int j=0;j<this.col;j++)
                {
                    System.out.println("Enter the"+i+"th row"+j+"th col element");
                    this.m[i][j]=Integer.parseInt(br1.readLine());
                }
            }
        }
        catch(Exception e)
        {}
       
    }
    public void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
            System.out.print("\t");
        }
        System.out.println();
    }
}
class multi extends Thread
{
    Matrix m1;
    Matrix m2;
    int i;
    int a[];
    multi(Matrix m1,Matrix m2,int i)
    {
        this.m1=m1;
        this.m2=m2;
        this.i=i;
        this.a=new int[m2.col];
    }
    public void run()
    {
        try
        {
            for(int j=0;j<m2.col;j++)
            {
                a[j]=0;
                for(int k=0;k<m1.col;k++)
                {
                    a[j]+=m1.m[i][k]*m2.m[k][j];
                }
            }
            synchronized(m1)
            {
                this.m1.display(a);
            }
        }
        catch(Exception e)
        {
        }
    }
}
public class main1
{
    public static void main(String args[])
    {
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the 1st row");
            int r1=Integer.parseInt(br.readLine());
            System.out.println("Enter the 2nd row");
            int r2=Integer.parseInt(br.readLine());
            System.out.println("Enter the 1st column");
            int c1=Integer.parseInt(br.readLine());
            System.out.println("Enter the 2nd column");
            int c2=Integer.parseInt(br.readLine());
            if(c1!=r2)
            {
                System.out.println("Multiplication not possible");
            }
            else
            {
                Matrix mat1=new Matrix(r1,c1);
                mat1.read();
                Matrix mat2=new Matrix(r2,c2);
                mat2.read();
                for(int i=0;i<r1;i++)
                {
                    multi mat3=new multi(mat1,mat2,i);
                    mat3.start();
                }
            }
        }
        catch(Exception e)
        {}
    }
}