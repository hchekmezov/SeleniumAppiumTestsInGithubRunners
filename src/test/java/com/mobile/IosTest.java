package com.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import lombok.SneakyThrows;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;

public class IosTest {

    @SneakyThrows
    @Test
    public void testAppLaunchIOS() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability("isHeadless",true);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "IPhone");
        capabilities.setCapability(MobileCapabilityType.UDID, "9A856D0A-3E48-4611-9E9C-21BF9C1B1FA6");
        //capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/DailyCheck.zip");
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/TestApp-iphonesimulator.app");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),
                capabilities);
    }
}
