public class actFunction {

    public static double Sigmoid(double net){
        double y=1/(1+Math.pow(Math.E,-1*net));
        return y;
    }

    public static double ReLU(int net) {
        double y=(net>0)?net:0;
        return y;
    }
}
