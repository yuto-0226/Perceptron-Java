import java.util.*;
public class Perceptron{
    public static void main(final String[] args) {
        Scanner sc=new Scanner(System.in);
        final train tr = new train(0.02); // 生成物件
        tr.fit(0,200);    //訓練
        //完成
        int x;
        double net;
        while(sc.hasNext()){
            System.out.print("[Input]");
            x=sc.nextInt();
            net=tr.Sigma(x);
            System.out.println();
            System.out.println("[Output]"+actFunction.Sigmoid(net));
        }
    }
}