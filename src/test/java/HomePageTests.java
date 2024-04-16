import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class HomePageTests {
    private static HomePage homePage;

    @BeforeAll
    public static void setUp() {
        open("https://qa-routes.praktikum-services.ru/");
        homePage = new HomePage();
    }
    @Test
    public void testRoute() {
        String from = "Усачева, 3";
        String to = "Фрунзенская набережная, 46";
        String hours = "10";
        String minutes = "20";

        homePage.inputHours(hours);
        homePage.inputMinutes(minutes);
        homePage.inputDataFrom(from);
        homePage.inputDataTo(to);
        homePage.choiceTypeOptional();

    }
}
