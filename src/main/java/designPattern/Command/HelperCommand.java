package designPattern.Command;

/**
 * Created by cctv on 2016/12/12.
 */
public class HelperCommand implements Command {

    private HelperHander hhObj;

    public HelperCommand(){
        hhObj = new HelperHander();
    }

    //调用接受者的对应的命令请求方法
    @Override
    public void execute() {
        hhObj.display();
    }
}
