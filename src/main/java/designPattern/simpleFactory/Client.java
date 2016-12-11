package designPattern.simpleFactory;

/**
 * Created by cctv on 2016/12/11.
 */
public class Client {
    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("histogram");
        chart.display();
    }
}
