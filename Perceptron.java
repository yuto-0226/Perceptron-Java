import java.util.*;
public class Perceptron{
    public static void main(final String[] args) {
        Scanner sc=new Scanner(System.in);
        final train tr = new train(1.45); // 生成物件
        tr.fit(0,200);    //訓練
        //完成
        int x;
        double net;
        while(sc.hasNext()){
            try {
                x=sc.nextInt();
                net=tr.Sigma(x);
                System.out.println();
                System.out.println(" >> "+actFunction.Sigmoid(net));
            
            } catch (InputMismatchException e) {
                System.out.println("System Error >> "+e);
                x=0;
                break;
            }
        }
    }
}