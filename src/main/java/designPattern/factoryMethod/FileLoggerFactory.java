package designPattern.factoryMethod;

/**
 * Created by cctv on 2016/12/11.
 */
public class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        System.out.println("初始化文件记录器");
        Logger logger = new FileLogger();
        System.out.println("创建文件");
        return logger;
    }
}
