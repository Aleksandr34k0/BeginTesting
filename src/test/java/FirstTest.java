import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTest {

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Alex");
        $("[id=userEmail]").setValue("G-oo-d@das.com");
        $("[id=currentAddress]").setValue("Russia");
        $("[id=permanentAddress]").setValue("Moscow");
        $("[id=submit]").click();

        $("[id=search]").shouldHave(text("https://selenide.org"));
    }

}
