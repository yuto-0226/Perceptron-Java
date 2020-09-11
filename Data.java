public class Data {
    //生成於 max 到 min 中 Integer 亂數 ,用法 data(最大值,最小值)
    public double data(double max,double min){
        double x=(int)(Math.random() * (max - min + 1) + min);
        return (int)x;
    }
}