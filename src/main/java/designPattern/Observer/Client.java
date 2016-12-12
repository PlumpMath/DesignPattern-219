package designPattern.Observer;

/**
 * Created by cctv on 2016/12/12.
 */
public class Client {
    public static void main(String[] args) {
        AllyController controller = new ConcreteAllyController("蜀");
        Player zhangsan = new Player("张三");
        controller.join(zhangsan);
        controller.join(new Player("李四"));
        controller.join(new Player("王五"));
        Player player = new Player("赵六");
        player.beAttached(controller);
        System.out.println("-------");
        zhangsan.beAttached(controller);
    }
}
