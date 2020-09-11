public class actFunction {
    //Sigmoid函數 ,用法 Sigmoid(net)
    public static float Sigmoid(double net){
        double y=(float)1/(1+Math.pow(Math.E,-1*net));
        return (float) y;
    }
    //ReLU函數 ,用法 ReLU(net)
    public static float ReLU(double net) {
        double y=(net>0)?net:0;
        return (float)y;
    }
}