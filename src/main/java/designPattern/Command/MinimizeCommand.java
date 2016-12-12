package designPattern.Command;

/**
 * Created by cctv on 2016/12/12.
 */
public class MinimizeCommand implements Command {

    private WindowHander whObj;

    public MinimizeCommand(){
        whObj = new WindowHander();
    }

    //调用接受者的最小化方法
    @Override
    public void execute() {
        whObj.minimize();
    }
}
