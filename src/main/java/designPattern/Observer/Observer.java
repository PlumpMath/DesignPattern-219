package designPattern.Observer;

/**
 * Created by cctv on 2016/12/12.
 * 观察者接口
 */
public interface Observer {
    String getName();
    void setName(String name);
    void help();//支援盟友
    void beAttached(AllyController acc);//遭受攻击
}
