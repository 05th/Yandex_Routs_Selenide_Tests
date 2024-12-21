package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class HomePageTests extends BaseTest{

// route type Optimal
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
// route type Fastest
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
// route type Custom
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
// choice Optimal type
    @Test
    public void testChoiceOptimalOptions() {
        homePage.choiceTypeOptional();
        homePage.choiceTypeCar();
    }


}