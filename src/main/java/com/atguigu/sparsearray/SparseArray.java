package com.atguigu.sparsearray;

/**
 * ClassName: SparseArray
 * Package: com.atguigu.sparsearray
 * Description:
 *
 * @Author sunao
 * @Create 2023/9/20 21:43
 * @Version 1.0
 */
public class SparseArray {

    public static void main(String[] args) {
        //创建一个原始的二维数组11*11
        //0:表示没有棋子,1表示黑子,2表示蓝子
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        //输出原始的二维数组
        System.out.println("原始二维数组");
        for (int[] row : chessArr1){
            for (int data: row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //将二位数组转稀疏数组
        //1.先遍历二维数组得到非0数据的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j] != 0){
                    sum ++;
                }
            }
        }
        System.out.println(sum);

        //2.创建对应的稀疏数组



    }
}
