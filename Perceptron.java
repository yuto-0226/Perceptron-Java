

import java.util.*;
public class Perceptron{
    public static void main(final String[] args) {
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        final train tr = new train(1.45); // �ͦ�����
//        tr.fit(0,200,52005);    //�V�m
        	tr.fit(0,200,52005);
        //����
        int x;
        double net;
        System.out.println(" >> �Y��J�Ȥj�� 100 �N�|��X 1 �Ϥ���X 0\n");
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
