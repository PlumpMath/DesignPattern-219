package designPattern.Command;

import org.apache.poi.util.SystemOutLogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cctv on 2016/12/12.
 * 功能键设置窗口类
 */
public class FBSettingWindow {
    private String title;
    private List<FunctionButton> functionButtons = new ArrayList<>();

    public FBSettingWindow(String title){
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton fb){
        functionButtons.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb){
        functionButtons.remove(fb);
    }

    /**
     * 显示窗口和功能键
     */
    public void display(){
        System.out.println("显示窗口.."+title);
        System.out.println("显示功能键:");
        for(FunctionButton button : functionButtons){
            System.out.println(button.getName());
        }
        System.out.println("**************end**************");
    }
}
