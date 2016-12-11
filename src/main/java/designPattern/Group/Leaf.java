package designPattern.Group;

/**
 * Created by cctv on 2016/12/11.
 */
public class Leaf extends Component {
    public void add(Component c) {
        System.out.println("叶子结点添加");
    }

    public void remove(Component c) {
        System.out.println("叶子结点删除");
    }

    public Component getChild(int i) {
        System.out.println("叶子结点删除");
        return null;
    }

    public void operation() {
        System.out.println("叶子结点操作");
    }
}
