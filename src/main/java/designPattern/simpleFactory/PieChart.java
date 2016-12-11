package designPattern.simpleFactory;

/**
 * Created by cctv on 2016/12/11.
 */
public class PieChart implements Chart {
    public PieChart(){
        System.out.println("创建饼状图");
    }

    public void display() {
        System.out.println("显示饼状图...");
    }
}
