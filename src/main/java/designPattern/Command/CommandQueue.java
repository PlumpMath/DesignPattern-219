package designPattern.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cctv on 2016/12/12.
 * 命令队列，当一个请求发送者发送一个请求时，将不止一个
 * 请求接受者响应，接受者按照一定的顺序执行业务方法
 */
public class CommandQueue {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void removeCommand(Command command){
        commands.remove(command);
    }

    public void execute(){
        for(Command command:commands){
            command.execute();
        }
    }
}
