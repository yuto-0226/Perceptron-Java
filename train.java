
public class train {
    private final double eta;    // 學習率
    private double e;    // 閥值
    private double w;    // 權重
    private double net;    // x加總
    private double t;    // 預估值
    private int count;    // 更新次數

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

    public void fit(double max, double min) {
         Data d = new Data();
        double[] y=new double[52005];
        double[] x=new double[52005];
        count = 1;
        int wr=0;    //錯誤次數
        int i=0;    //陣列資料
        float per=0;
        while (count!=52005) {
            x[i] = d.data(max, min);
            t = (x[i] > 100) ? 1 : 0; // 設定預計值
            net = Sigma(x[i]);
            y[i] = actFunction.Sigmoid(net);

            // 更新
            w += eta * (t - y[i]) * x[i];
            e += eta * (t - y[i]) * 1;

            if(t-y[i]!=0){
                wr+=1;
            }
            per=per(wr, x);
            //印出
            System.out.println("[" + count + "]Input="+x[i] +" ,Output="+ y[i] +" ,w="+w+" ,e="+e+" ,Bias="+(eta*(t-y[i])*x[i])+" ,erro="+wr+" >> "+per);


            count += 1;
            i+=1;

//            if (per>=0.9999997) {
//                System.out.println("--Finished--\n");
//                 break;
//             }
        }
        System.out.println("\n");

    }
    //加總
    public double Sigma(final double x) {
        net=(x * w - e);
        return net;
    }
    
}
