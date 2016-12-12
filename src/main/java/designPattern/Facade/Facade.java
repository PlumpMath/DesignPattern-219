package designPattern.Facade;

/**
 * Created by cctv on 2016/12/11.
 */
public class Facade {
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public void mehtod(){
        subSystemA.methodA();
        subSystemB.methodB();
        subSystemC.methodC();
    }
}
