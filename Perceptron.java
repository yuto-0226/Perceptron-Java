import java.util.*;
public class Perceptron{
    public static void main(final String[] args) {
        Scanner sc=new Scanner(System.in);  //生成 Scanner 物件
        final train tr = new train(0.0045); //生成train物件 ,並設定學習速率
        double p;   //宣告正確率變數
        do{
            p=tr.fit(0,200);    //訓練 ,並將回傳值 per 存入變數 p
        }while(p!=1);
        System.out.println("--學習完成--\n");
        System.out.println(">>共 "+tr.total+" 筆測資");
        //完成
        int x;  //宣告輸入值變數
        double net; //宣告加總變數
        while(sc.hasNext()){    //EOF判斷
            try {
                x=sc.nextInt(); //將輸入值存入變數 x
                net=tr.Sigma(x);    //將 x 值加總後存入變數 net
                System.out.println(">> "+actFunction.Sigmoid(net)); //印出結果
            
            } catch (InputMismatchException e) {    //拋出輸入錯誤例外
                System.out.println("System Error >> "+e);   //印出例外
                break;  //結束程式碼
            }
        }
    }
}