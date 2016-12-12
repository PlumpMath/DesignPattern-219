package designPattern.Observer;

/**
 * Created by cctv on 2016/12/12.
 */
public class Player implements Observer {

    private String name;

    public Player(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void help() {
        System.out.println(name+"前来营救,help方法");
    }

    @Override
    public void beAttached(AllyController acc) {
        System.out.println(name+"被攻击了,beAttached方法");
        if(!acc.plays.contains(this)){
            System.out.println(acc.allyName+"战队的盟友没有被攻击");
            return ;
        }
        acc.notifyAllObserver(name);
    }
}
