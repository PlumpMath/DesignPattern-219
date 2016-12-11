package designPattern.factoryMethod;

/**
 * Created by cctv on 2016/12/11.
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory = new FileLoggerFactory();//可以通过配置xml文件实现
        Logger logger = factory.createLogger();
        logger.writeLog();
    }
}
