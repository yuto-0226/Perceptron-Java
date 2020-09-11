

import java.util.*;
public class Perceptron{
    public static void main(final String[] args) {
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        final train tr = new train(1.45); // 生成物件
//        tr.fit(0,200,52005);    //訓練
        	tr.fit(0,200,52005);
        //完成
        int x;
        double net;
        System.out.println(" >> 若輸入值大於 100 將會輸出 1 反之輸出 0\n");
        while(sc.hasNext()){
            try {
                x=sc.nextInt();
                net=tr.Sigma(x);
                System.out.println();
                System.out.println(" >> "+actFunction.Sigmoid(net));
            
            } catch (InputMismatchException e) {
                System.out.println(" >> System Error : "+e);
                x=0;
                break;
            }
        }
        
    }
}
