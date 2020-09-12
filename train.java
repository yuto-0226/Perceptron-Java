
public class train {
    private final double eta; // 學習率
    private double e; // 閥值
    private double w; // 權重
    private double net; // x加總
    private double t; // 預估值
    public int count; // 更新次數
    public int total; // 更新次數
    public double[] y = new double[15005]; // 設定陣列大小
    public double[] x = new double[15005];

    // 設定建構元 train(學習速率)
    public train(final double Eta) {
        this.eta = Eta; // 設定學習速率
        this.e = 15000; // this.e = 15650; //初始化閥值
        this.w = 0; // 初始化權值
        this.net = 0; // 初始化加總
        this.t = 0; // 初始化預測值
        this.count = 1; // 初始化組學習計數
        this.total = 0; // 初始化總學習計數
    }

    // 學習 ,用法 fit(最大值,最小值)
    public double fit(double max, double min) {
        Data d = new Data(); // 生成Data物件
        int wr = 0; // 錯誤次數
        int i = 0; // 單筆測資計數
        int dataset = 15000; // 設定單筆測資數
        double _Bias =0; // 更新值
        float per = 0; // 歸零正確率
        // 設定單次學習測資筆數
        while (i != dataset) {
            x[i] = d.data(max, min); // 亂數設定輸入測資 x 存入陣列
            t = (x[i] > 100) ? 1 : 0; // 設定預計值
            net = Sigma(x[i]); // 加總
            y[i] = actFunction.Sigmoid(net); // 丟入激發函數取 y 存入陣列
            // 更新
            _Bias= (eta * (t - y[i]) * x[i] * 1.0); // Math.pow((eta*(t-y[i])*x[i]*1.0),2);
            w += _Bias; // 設定權重更新值
            e += eta * (t - y[i]) * 1.0; // 設定閥值更新值
            // 錯誤測資計數
            if (t - y[i] != 0) {
                wr += 1;
            }
            i += 1; // 單次學習計數
            total += 1; // 總學習次數計數
        }
        per = per(wr, dataset); // 計算正確率
        System.out.println("[" + count + "] w=" + w + " ,e=" + e + " ,error=" + wr + " >> " + per); // 印出組學習結果
        count += 1; // 組學習計數
        return per; // 回傳正確率
    }
    // 加總 ,用法 Sigma(輸入值)
    public double Sigma(final double x) {
        net = (x * w - e);
        return net;
    }
    // 正確率計算 ,用法 per(錯誤次數,單筆測資計數)
    public float per(int wr, int dataset) {
        return (1 - (wr * 1.00f / dataset));
    }
}