package designPattern.simpleFactory;

/**
 * Created by cctv on 2016/12/11.
 */
public class ChartFactory {
    public static Chart getChart(String type){
        Chart chart = null;
        if("histogram".equalsIgnoreCase(type)){
            chart = new HistogramChart();
            System.out.println("工厂初始化柱状图");
        }else if("pie".equalsIgnoreCase(type)){
            chart = new PieChart();
            System.out.println("工厂初始化饼状图");
        }if("line".equalsIgnoreCase(type)){
            chart = new LineChart();
            System.out.println("工厂初始化折线图");
        }
        return chart;
    }
}
