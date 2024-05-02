package tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class HomePageTests {
    private static HomePage homePage;

    @BeforeAll
    public static void setUp() {
        open("https://qa-routes.praktikum-services.ru/");
        homePage = new HomePage();
    }

    @Test
    public void testRouteTypeOptimal() {
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

    @Test
    public void testRouteTypeFastest() {
        String from = "Усачева, 15";
        String to = "Фрунзенская набережная, 58";
        String hours = "12";
        String minutes = "10";

        homePage.inputHours(hours);
        homePage.inputMinutes(minutes);
        homePage.inputDataFrom(from);
        homePage.inputDataTo(to);
        homePage.choiceTypeFastest();
    }

    @Test
    public void testRouteTypeCustom() {
        String from = "Усачева, 48";
        String to = "Фрунзенская набережная, 15";
        String hours = "11";
        String minutes = "45";

        homePage.inputHours(hours);
        homePage.inputMinutes(minutes);
        homePage.inputDataFrom(from);
        homePage.inputDataTo(to);
        homePage.choiceTypeCustom();


    }

    @Test
    public void testChoiceOptimalOptions() {
        homePage.choiceTypeOptional();
        homePage.choiceTypeCar();
    }
}