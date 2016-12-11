package designPattern.factoryMethod;

/**
 * Created by cctv on 2016/12/11.
 */
public class DataBaseLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        System.out.println("logger-->连接数据库");
        Logger logger = new DataBaseLogger();
        System.out.println("logger-->初始化日志记录器");
        return logger;
    }
}
