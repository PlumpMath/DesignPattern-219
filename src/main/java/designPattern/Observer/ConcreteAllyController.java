package designPattern.Observer;

/**
 * Created by cctv on 2016/12/12.
 */
public class ConcreteAllyController extends AllyController {

    public ConcreteAllyController(String name){
        System.out.println(name+"战队成立");
        System.out.println("-------------------------");
        this.allyName = name;
    }

    @Override
    public void notifyAllObserver(String name) {
        System.out.println(this.allyName+"战队的"+name+"遭到攻击");
        for(Observer obs:plays){
            if(!obs.getName().equalsIgnoreCase(name)){
                obs.help();
            }
        }
    }
}
