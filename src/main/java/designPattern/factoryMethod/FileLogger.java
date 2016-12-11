package designPattern.factoryMethod;

/**
 * Created by cctv on 2016/12/11.
 */
public class FileLogger implements Logger {
    public void writeLog() {
        System.out.println("文件记录日志...");
    }
}
