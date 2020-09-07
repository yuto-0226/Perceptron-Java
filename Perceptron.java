import java.util.*;
public class Perceptron{
    public static void main(final String[] args) {
        final Scanner sc=new Scanner(System.in);
        final actFunction f=new actFunction();
        final train tr=new train(0.8);   //生成物件
        tr.fit(0,50000);    //訓練
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