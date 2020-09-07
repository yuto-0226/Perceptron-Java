public class Data {
    public double data(double max,double min){
        double x=(int)(Math.random() * (max - min + 1) + min);
        return x;
    }
}
