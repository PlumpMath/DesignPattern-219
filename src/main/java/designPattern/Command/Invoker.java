package designPattern.Command;

/**
 * Created by cctv on 2016/12/12.
 * 发送者将针对CommandQueue编程
 */
public class Invoker {
    private CommandQueue commandQueue;

    public Invoker(CommandQueue commandQueue){
        this.commandQueue = commandQueue;
    }

    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void callAll(){
        commandQueue.execute();
    }
}
