package designPattern.abstractFactory;

import javax.xml.soap.Text;

/**
 * Created by cctv on 2016/12/11.
 */
public interface SkinFactory {
    Button createButton();
    TextFiled createTextFiled();
    ComboBox createComboBox();
}
