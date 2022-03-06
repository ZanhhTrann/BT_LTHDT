import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;
class matrix{
    int a[][];
    int b[][];
    int newMat[][];

    void matchMatrix(char c){
        if(c=='+'||c=='-'){
            if(a.length==b.length&&a[0].length==b[0].length){
                newMat= new int[a.length][a[0].length];
                switch(c){
                    case '+':{
                        for(int i=0;i<a.length;i++){
                            for(int j=0;j<a[i].length;j++){
                                newMat[i][j]=a[i][j]+b[i][j];
                            }
                        }
                        break;
                    }
                    case '-':{
                        for(int i=0;i<a.length;i++){
                            for(int j=0;j<a[i].length;j++){
                                newMat[i][j]=a[i][j]-b[i][j];
                            }
                        }
                        break;
                    }
                }
            }else{
                System.out.println("kich thuoc hai ma tran khong bang nhau!!");
            }
        }else if(c=='*'){
            if(a[0].length==b.length){
                newMat= new int[a.length][b[0].length];
                int sum=0;
                for(int i=0;i<a.length;i++){
                    for(int j=0;j<b[0].length;j++){
                        for(int k=0;k<a[0].length;k++){
                            newMat[i][j]+=a[i][k]*b[k][j];
                        }
                        // newMat[i][j] = sum;
                        // sum=0;
                    }

                }
            }else{
                System.out.println("khong thoa man dieu kien!!\n");
            }
        }
    }
    void printMatrix(int[][] d){
        for (int i=0; i<d.length;i++){
            for(int j=0; j<d[i].length;j++){
                System.out.print(d[i][j]+" ");
            } 
            System.out.println("\r");
        }
        // System.out.println("\n");
    }
}
public class Javacore extends matrix
{
    public int[][] loadData(String filepath) throws Exception{
        // create a String array from the input file: input.txt
        String[] lines = (new String(Files.readAllBytes((new File(filepath))
                                   .toPath()))).replace("\r", "").split("\n");
        // declare a 2-dimensional int array with the 1st dimension of lines.length
        int a[][] = new int[lines.length][]; // create a 2 dimentinal array
        for (int i = 0; i < lines.length; ++i) {
          String[] x = lines[i].split(" "); // string array of each line
          a[i] = new int[x.length];  // create the 2nd dimension with the length of each line
          for (int j = 0; j < x.length; ++j) // convert to int
            a[i][j] = x[j].length() == 0? -1:Integer.parseInt(x[j]);
        }
        return a;
    }

    public static void main(String[] args) throws Exception {
        matrix mtx = new matrix();
        mtx.a= new Javacore().loadData("input1.txt");
        mtx.b= new Javacore().loadData("input2.txt");
        System.out.println("Ma tran a:");
        mtx.printMatrix(mtx.a);
        System.out.println("Ma tran b:");
        mtx.printMatrix(mtx.b);
        System.out.println("Ma tran a+b:");
        mtx.matchMatrix('+');
        mtx.printMatrix(mtx.newMat);
        System.out.println("Ma tran a-b:");
        mtx.matchMatrix('-');
        mtx.printMatrix(mtx.newMat);
        System.out.println("Ma tran a*b:");
        mtx.matchMatrix('*');
        mtx.printMatrix(mtx.newMat);
    }
}