package designPattern.abstractFactory;

/**
 * Created by cctv on 2016/12/11.
 */
public class SummerSkinFactory implements  SkinFactory {
    public Button createButton() {
        return new SummerButton();
    }

    public TextFiled createTextFiled() {
        return new SummerTextField();
    }

    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
