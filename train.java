



public class train {
    private final double eta;    // �ǲ߲v
    private double e;    // �֭�
    private double w;    // �v��
    private double net;    // x�[�`
    private double t;    // �w����
    public int count;    // ��s����
    public float per;

    public train(final double Eta) {
        this.eta = Eta;
        this.e = 15650;
        this.w = 0;
        this.net = 0;
        this.t = 0;
        this.count = 0;
    }

    public float per(int w, double[] x) {

        return (1 - (w * 1.00f / x.length));
    }

    public void fit(double max, double min,int range) {
         Data d = new Data();
        double[] y=new double[range];
        double[] x=new double[range];
        count = 1;
        int wr=0;    //���~����
        int i=0;    //�}�C���
        per=0;
        while (count!=range) {
            x[i] = d.data(max, min);
            t = (x[i] > 100) ? 1 : 0; // �]�w�w�p��
            net = Sigma(x[i]);
            y[i] = actFunction.Sigmoid(net);

            // ��s
            w += eta * (t - y[i]) * x[i];
            e += eta * (t - y[i]) * 1;

            if(t-y[i]!=0){
                wr+=1;
            }
            per=per(wr, x);
            //�L�X
            System.out.println("[" + count + "]Input="+x[i] +" ,Output="+ y[i] +" ,w="+(((int)(w*1000))/1000.0)+" ,e="+(((int)(e*1000))/1000.0)+" ,Bias="+(eta*(t-y[i])*x[i])+" ,erro="+wr+" >> "+per);


            count += 1;
            i+=1;

            if (per>=0.9999&&i>=150) {
                System.out.println("--Finished--\n");
                 break;
             }
        }
        System.out.println("\n");

    }
    //�[�`
    public double Sigma(final double x) {
        net=(x * w - e);
        return net;
    }
    
}
