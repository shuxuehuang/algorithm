package day1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class test {
    public static void main(String[] args) throws IOException {
        int n = 11;
        int[][] ints = new int[n][n];
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints[i].length; j++) {
                if (i == j){
                    ints[i][j] = 0;
                }else {
                    ints[i][j] = (int) Math.round(Math.random()*100);
                }

            }
        }
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[j][i] = ints[i][j];
            }
        }
        for (int[] ints1 : ints) {
            System.out.println(Arrays.toString(ints1));
        }
        File file = new File("d:\\input.txt");  //存放数组数据的文件

        FileWriter out = new FileWriter(file);  //文件写入流

        //将数组中的数据写入到文件中。每行各数据之间TAB间隔
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                out.write(ints[i][j]+" ");
            }
            out.write("\r\n");
        }
        out.close();



    }
}
