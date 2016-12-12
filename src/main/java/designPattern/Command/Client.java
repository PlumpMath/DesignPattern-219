package designPattern.Command;

import designPattern.util.XMLUtil;

/**
 * Created by cctv on 2016/12/12.
 */
public class Client {
    public static void main(String[] args) {
        FBSettingWindow fbsw = new FBSettingWindow("功能键设置");

        FunctionButton fb1 = new FunctionButton("功能键1");
        FunctionButton fb2 = new FunctionButton("功能键2");

        Command command1 = (Command) XMLUtil.getBean(0);
        Command command2 = (Command) XMLUtil.getBean(1);

        fb1.setCommand(command1);
        fb2.setCommand(command2);

        fbsw.addFunctionButton(fb1);
        fbsw.addFunctionButton(fb2);
        fbsw.display();

        System.out.println("******************");
        fb1.onclick();
        fb2.onclick();
    }
}
