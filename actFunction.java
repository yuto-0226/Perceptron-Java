public class actFunction {

    public static float Sigmoid(double net){
        double y=(float)1/(1+Math.pow(Math.E,-1*net));
        return (float) y;
    }

    public static float ReLU(int net) {
        float y=(net>0)?net:0;
        return y;
    }
}
