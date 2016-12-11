package designPattern.abstractFactory;

/**
 * Created by cctv on 2016/12/11.
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory factory = new SummerSkinFactory();
        Button button = factory.createButton();
        ComboBox comboBox = factory.createComboBox();
        TextFiled textFiled = factory.createTextFiled();
        button.display();
        comboBox.display();
        textFiled.display();
    }
}
