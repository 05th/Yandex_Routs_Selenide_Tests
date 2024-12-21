package tests;

import org.junit.jupiter.api.BeforeAll;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    protected static HomePage homePage;
    @BeforeAll
    public static void setUp() {
        open("https://qa-routes.praktikum-services.ru/");
        homePage = new HomePage();
    }
}