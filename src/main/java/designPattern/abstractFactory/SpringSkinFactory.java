package designPattern.abstractFactory;

/**
 * Created by cctv on 2016/12/11.
 */
public class SpringSkinFactory implements SkinFactory{

    public Button createButton() {
        return new SpringButton();
    }

    public TextFiled createTextFiled() {
        return new SpringTextField();
    }

    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
