package designPattern.Command;

/**
 * Created by cctv on 2016/12/12.
 * 请求的发送者
 */
public class FunctionButton {
    private String name;
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public FunctionButton(String name){
        this.name=name;
    }

    public void onclick(){
        System.out.println("点击功能键:");
        command.execute();
    }
}
