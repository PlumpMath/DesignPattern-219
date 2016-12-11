package designPattern.Group;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cctv on 2016/12/11.
 */
public class Composite extends Component {

    private List<Component> list = new ArrayList<Component>();

    public void add(Component c) {
        list.add(c);
    }

    public void remove(Component c) {
        list.remove(c);
    }

    public Component getChild(int i) {
        return list.get(i);
    }

    public void operation() {
        //调用叶子结点的方法
        for(Component c :list){
            c.operation();
        }
    }
}
