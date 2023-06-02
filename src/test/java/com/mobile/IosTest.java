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
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "IPhone 14 Plus");
        capabilities.setCapability(MobileCapabilityType.UDID, "682968C3-1384-46DF-BCEC-C99DF8424B7B");
        //capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/DailyCheck.zip");
        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/TestApp-iphonesimulator.app");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),
                capabilities);
    }
}
