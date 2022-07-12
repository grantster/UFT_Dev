package com.company;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.*;
import com.hp.lft.verifications.Verify;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import unittesting.*;

import static unittesting.UnitTestClassBase.globalTearDown;

public class UFTDeveloperTest extends UnitTestClassBase {

    public UFTDeveloperTest() throws GeneralLeanFtException {
        //Change this constructor to private if you supply your own public constructor

    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new UFTDeveloperTest();
        globalSetup(UFTDeveloperTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException {
        Browser browser = BrowserFactory.launch(BrowserType.CHROME);

        browser.sync();

        browser.navigate("http://advantageonlineshopping.com/#/");

        Link speakersCategoryTxtLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("SPEAKERS")
                .tagName("SPAN").build());
        speakersCategoryTxtLink.click();

        WebElement boseSoundlinkBluetoothSpeakerIIIWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("Bose Soundlink Bluetooth Speaker III")
                .tagName("A").build());
        boseSoundlinkBluetoothSpeakerIIIWebElement.click();

        Link hOMELink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("HOME")
                .tagName("A").build());
        hOMELink.click();

        Link tabletsCategoryTxtLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("TABLETS")
                .tagName("SPAN").build());
        tabletsCategoryTxtLink.click();

        WebElement hPElitePad1000G2TabletWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("HP ElitePad 1000 G2 Tablet")
                .tagName("A").build());
        hPElitePad1000G2TabletWebElement.click();

        Button saveToCartButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .name("ADD TO CART")
                .tagName("BUTTON").build());
        saveToCartButton.click();

        hOMELink.click();

        Link laptopsCategoryTxtLink = browser.describe(Link.class, new LinkDescription.Builder()
                .innerText("LAPTOPS")
                .tagName("SPAN").build());
        laptopsCategoryTxtLink.click();

        WebElement hPChromebook14G1ESWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("HP Chromebook 14 G1(ES)")
                .tagName("A").build());
        hPChromebook14G1ESWebElement.click();

        hOMELink.click();

        Link shoppingCartLink = browser.describe(Link.class, new LinkDescription.Builder()
                .accessibilityName("ShoppingCart")
                .innerText("1 ")
                .role("link")
                .tagName("A").build());
        shoppingCartLink.click();

        WebElement webElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .className("roboto-medium ng-binding")
                .innerText("$1,009.00")
                .tagName("SPAN").build());
        Verify.areEqual("$1,009.00", webElement.getInnerText(), "Verification", "Verify property: innerText");

        WebElement rEMOVEWebElement = browser.describe(WebElement.class, new WebElementDescription.Builder()
                .innerText("REMOVE")
                .tagName("A").build());
        rEMOVEWebElement.click();

        hOMELink.click();

    }

}