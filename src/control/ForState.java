package control;

public class ForState {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        for(int tmp : arr){
            System.out.println(tmp);
        }

        Loop1 : for(int i=2; i<=9; i++){ //1
            for(int j=1; j<=9; j++){ //2
                if(j==5)
                    break Loop1; // 1번 2번 반복문 모두 벗어남
//                  break; // 2번 반복문만 벗어남
                System.out.println(i+"*"+j+"="+ i*j);
            }
            System.out.println();
        }
    }
}
