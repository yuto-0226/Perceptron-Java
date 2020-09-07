

public class train {
    private final double eta;    // 學習率
    private double e;    // 閥值
    private double w;    // 權重
    private double net;    // x加總
    private double t;    // 預估值
    private int count;    // 預估值

    public train(final double Eta) {
        this.eta = Eta;
        this.e = 0;
        this.w = 0;
        this.net = 0;
        this.t = 0;
        this.count = 0;
    }

    public void fit(final double max, final double min) {
        final actFunction f = new actFunction();
        final Data d = new Data();
        double y;
        double x;
        count = 1;
        while (count<=10000) {
            x = d.data(max, min);
            t = (x > 10000) ? 1 : 0; // 設定預計值
            net = Sigma(x);
            y = actFunction.Sigmoid(net);
//            if ((eta * (t - y) * x) == 0) {
//                System.out.println("--Finished--\n");
//                break;
//            }
            // 更新
            w += eta * (t - y) * x;
            e += eta * (t - y) * 1;
            //印出
            System.out.println("[" + count + "]input=" + x + " ,w=" + w + " ,e=" + e + " ,Bias=" + (eta * (t - y) * x));
            count += 1;
        }

    }

    public double Sigma(final double x) {
        net=(x * w + e);
        return net;
    }
    
}
