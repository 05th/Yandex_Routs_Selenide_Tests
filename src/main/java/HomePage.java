import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    private SelenideElement setHours = $("#form-input-hour");
    private SelenideElement setMinutes = $("#form-input-minute");
    private SelenideElement inputFromField = $("#form-input-from");
    private SelenideElement inputToField = $("#form-input-to");
    private SelenideElement typeOptimal = $("#form-mode-optimal");
    private SelenideElement typeFastest = $("#form-mode-fastest");
    private SelenideElement typeCustom = $("#form-mode-custom");


    public void inputHours(String hours) {
        setHours.setValue(hours);
    }

    public void inputMinutes(String minutes) {
        setMinutes.setValue(minutes);
    }

    public void inputDataFrom(String from) {
        inputFromField.setValue(from);
    }

    public void inputDataTo(String to) {
        inputToField.setValue(to);
    }

    public void choiceTypeOptional() {
        typeOptimal.click();
    }

    public void choiceTypeFastest() {
        typeFastest.click();
    }

    public void choiceTypeCustom() {
        typeCustom.click();
    }

}
