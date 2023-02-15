package ru.netology.web;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class CardTest {

    @Test
    void shouldTest() throws InterruptedException {
open("http://localhost:9999/");
        $("input[name=\"name\"]").setValue("Белошкурник Анна");
        $("input[name=\"phone\"]").setValue("+79107651717");
        $("label").click();
        $("button[type=\"button\"]").click();
        $("p[data-test-id=\"order-success\"]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
