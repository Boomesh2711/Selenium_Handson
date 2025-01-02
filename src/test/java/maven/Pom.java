package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Pom {

    public static WebElement element = null; // Webelement is a return type of the method

    public static WebElement searchbox(WebDriver driver) {

        element = driver.findElement(By.xpath("//input[@type='text']"));
        return element;
    }

    public static WebElement tv(WebDriver driver) {

        element = driver.findElement(By.xpath("//span[@class='TSD49J'and text()='TVs & Appliances']"));
        return element;
    }

    public static WebElement wash(WebDriver driver) {

        element = driver.findElement(By.xpath("//a[@title='Fully Automatic Front Load']"));
        return element;
    }

    public static WebElement Elements(WebDriver driver) {
        element = driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']"));
        return element;
    }

    public static WebElement textboxelement(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[text()='Text Box']"));
        return element;
    }

    public static WebElement name(WebDriver driver) {
        element = driver.findElement(By.id("j_idt88:name")); // id of the name field
        return element;
    }

    public static WebElement textAppend(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]")); // xpath of the text append field
        return element;
    }

    public static WebElement retriveText(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")); // xpath of the text append field
        return element;
    }

    public static WebElement clearText(WebDriver driver) {
        element = driver.findElement(By.id("j_idt88:j_idt95")); // id of the clear text field
        return element;
    }

    public static WebElement disableText(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-disabled']")); // class of the disable text field
        return element;
    }

    public static WebElement textTab(WebDriver driver) {
        element = driver.findElement(By.id("j_idt88:j_idt99")); // id of the text tab field
        return element;
    }

    public static WebElement nextFocus(WebDriver driver) {
        element = driver.findElement(By.id("j_idt88:j_idt101")); // id of the next focus field
        return element;
    }

    public static WebElement Button(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[text()='Button']")); // xpath of the button element
        return element;
    }

    public static WebElement GetPositionButton(WebDriver driver) {
        element = driver.findElement(By.id("j_idt88:j_idt94")); // xpath of the button field to get the position
        return element;
    }

    public static WebElement GetColorButton(WebDriver driver) {
        element = driver.findElement(By.id("j_idt88:j_idt96")); // xpath of the button field to get the color
        return element;
    }

    public static WebElement GetSizeButton(WebDriver driver) {
        element = driver.findElement(By.id("j_idt88:j_idt98")); // xpath of the button field to get the size
        return element;
    }

    public static WebElement Dropdown(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[text()='Dropdown']")); // xpath of the dropdown element
        return element;
    }

    public static WebElement SelectDropdown(WebDriver driver) {
        element = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")); // xpath of the dropdown field
        return element;
    }

    public static WebElement SelectIndexDropdown(WebDriver driver) {
        element = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")); // xpath of the dropdown field
        return element;
    }

    public static WebElement SelectByValueDropdown(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")); // id of the dropdown field
        return element;

    }

    public static WebElement BrowserElement(WebDriver driver) {
        element = driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")); // id of the dropdown field
        return element;
    }

    public static WebElement AlertIcon(WebDriver driver) {
        element = driver.findElement(By.xpath("//i[@class='pi pi-fw pi-clone layout-menuitem-icon']")); // id of the dropdown field
        return element;
    }

    public static WebElement Alertbutton(WebDriver driver) {
        element = driver.findElement(By.id("j_idt88:j_idt91")); // id of the dropdown field
        return element;
    }

    public static WebElement ConfirmAlert(WebDriver driver) {
        element = driver.findElement(By.id("j_idt88:j_idt93")); // id of the dropdown field
        return element;
    }

    public static WebElement PromptAlert(WebDriver driver) {
        element = driver.findElement(By.id("j_idt88:j_idt104")); // id of the dropdown field
        return element;
    }

    public static WebElement RadioButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//i[@class='pi pi-fw pi-stop-circle layout-menuitem-icon']")); // xpath of the dropdown field
        return element;
    }

    public static WebElement RadioChrome(WebDriver driver) {
        element = driver.findElement(By.xpath("//label[@for='j_idt87:console2:0' and text()='Chrome']\n")); // id of the dropdown field
        return element;
    }

    public static WebElement RadioSafari(WebDriver driver) {
        element = driver.findElement(By.xpath("//label[@for='j_idt87:console2:2' and text()='Safari']\n")); // id of the dropdown field
        return element;
    }

    public static WebElement RadioEdge(WebDriver driver) {
        element = driver.findElement(By.xpath("//label[@for='j_idt87:console2:3' and text()='Edge']\n")); // id of the dropdown field
        return element;
    }

    public static WebElement RadioFirefox(WebDriver driver) {
        element = driver.findElement(By.xpath("//label[@for='j_idt87:console2:1' and text()='Firefox']\n")); // id of the dropdown field
        return element;
    }

    public static WebElement Window(WebDriver driver) {
        element = driver.findElement(By.xpath("//i[@class='pi pi-fw pi-window-maximize layout-menuitem-icon']")); // xpath of the dropdown field
        return element;
    }

    public static WebElement OpenNewWindow(WebDriver driver) {
        element = driver.findElement(By.id("j_idt88:new")); // id of the dropdown field
        return element;
    }

    public static WebElement multipleWindows(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")); // xpath of the dropdown field
        return element;
    }

    public static WebElement OpenNewTab(WebDriver driver) {
        element = driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")); // xpath of the dropdown field
        return element;
    }

    public static WebElement Frame(WebDriver driver) {
        element = driver.findElement(By.xpath("//i[@class='pi pi-fw pi-stop layout-menuitem-icon']")); // xpath of the dropdown field
        return element;
    }

    public static WebElement InsideFrame(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@id='Click']")); // xpath of the dropdown field
        return element;
    }

    public static WebElement NestedFrame(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"Click\"]")); // xpath of the dropdown field
        return element;
    }
    public static WebElement Dragelement(WebDriver driver) {
        element = driver.findElement(By.xpath("//i[@class='pi pi-fw pi-calendar layout-menuitem-icon' ]")); // xpath of the dropdown field
        return element;
    }

    public static WebElement Draggable(WebDriver driver) {
        element = driver.findElement(By.id("form:drag_content")); // id of the dragable field
        return element;
    }
    public static WebElement Droppale(WebDriver driver) {
        element = driver.findElement(By.id("form:drop_content")); // id of the droppable field
        return element;
    }

    public static WebElement Autocomplete(WebDriver driver) {
        element = driver.findElement(By.xpath("(//input[@type='text'])[4]")); // xpath of the dropdown field
        return element;
    }

    public static WebElement Autocomplete1(WebDriver driver) {

        List<WebElement> ListOFOptions;
        ListOFOptions=driver.findElements(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/li"));
        return element;
    }


    public static WebElement MiscIcon(WebDriver driver) {
        element = driver.findElement(By.xpath("//i[@class='pi pi-circle-off layout-menuitem-icon']")); // xpath of the dropdown field
        return element;
    }
    public static WebElement Files(WebDriver driver) {
        element = driver.findElement(By.xpath("//i[@class='pi pi-fw pi-file layout-menuitem-icon']")); // xpath of the dropdown field
        return element;
    }
    public static WebElement Download(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-arrow-down']")); // xpath of the dropdown field
        return element;
    }
    public static WebElement Upload(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]")); // xpath of the dropdown field
        return element;
    }
    public static WebElement Hyperlinkicon(WebDriver driver) {
        element = driver.findElement(By.xpath(  "//i[@class='pi pi-fw pi-link layout-menuitem-icon']")); // xpath of the dropdown field
        return element;
    }
    public static WebElement Homepage(WebDriver driver) {
        element = driver.findElement(By.linkText("Go to Dashboard"));
        return element;
    }
    public static WebElement FindUrl(WebDriver driver) {
        element = driver.findElement(By.partialLinkText("Find the URL"));
        return element;
    }
    public static WebElement VerifyLink(WebDriver driver) {
        element = driver.findElement(By.linkText("Broken?"));
        return element;
    }
}
