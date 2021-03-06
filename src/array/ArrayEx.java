package array;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        int[] iArr = {100,95,80,70,60};
        char[] chArr = {'a','b','c','d'};
        System.out.println(Arrays.toString(iArr));
        System.out.println(iArr);
        System.out.println(chArr);

        int[] arr = new int[5];
        int[] tmp = new int[arr.length*2];
        for(int i=0; i<arr.length; i++){
            tmp[i] = arr[i];
        }
        arr = tmp;
        System.out.println(arr);
        System.out.println(tmp);

        char[] abc = {'A','B','C','D'};
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};
        char[] result = new char[abc.length+num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        int[][] score = new int[4][3];
        score[0][0] = 100;
        System.out.println(score[0][0]);

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = 10;
            }
        }

        int[][] variableArr = new int[5][];
        variableArr[0] = new int[4];
        variableArr[1] = new int[3];
        variableArr[2] = new int[2];
        variableArr[3] = new int[1];
        variableArr[4] = new int[3];
    }
}
