package designPattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cctv on 2016/12/12.
 * 战队控制类，目标类
 */
public abstract class AllyController {

    protected String allyName;//战队名称
    protected List<Observer> plays = new ArrayList<>();//存储战队人员

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName() {
        return allyName;
    }

    public void join(Player player){
        System.out.println(player.getName()+"加入"+allyName+"战队");
        plays.add(player);
    }

    public void quit(Player player){
        System.out.println(player.getName()+"退出"+allyName+"战队");
        plays.remove(player);
    }

    public abstract void notifyAllObserver(String name);
}
