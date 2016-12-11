package designPattern.factoryMethod;

/**
 * Created by cctv on 2016/12/11.
 */
public class DataBaseLogger implements Logger {
    public void writeLog() {
        System.out.println("数据库记录日志");
    }
}
