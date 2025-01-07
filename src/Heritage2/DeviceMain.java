package Heritage2;

import java.util.ArrayList;

public class DeviceMain {

    public static void start() {
        ArrayList<Device> devices= new ArrayList<>();
        SmartPhone flagshipPhone = new SmartPhone(
                999.99,                   // price
                6.5,                      // screenLengthInch
                3.0,                      // screenWidthInch
                "TechCorp",               // brand
                "Infinity X",             // model
                0.2,                      // weight (in kg)
                "2400x1080",              // resolution
                5000,                     // battery (mAh)
                10,                       // bph (battery per hour)
                "Android 14"              // OS
        );
        TV smartTV = new TV(
                800.00,                   // price
                55.0,                     // screenLengthInch
                30.0,                     // screenWidthInch
                "VisionTech",             // brand
                "UltraHD 4K",             // model
                20.0,                     // weight (in kg)
                "3840x2160",              // resolution
                "OLED",                   // displayType
                120,                      // refreshRate (Hz)
                200                       // wph (watts per hour)
        );
        Laptop ultrabook = new Laptop(
                1200.00,                  // price
                13.3,                     // screenLengthInch
                8.6,                      // screenWidthInch
                "UltraTech",              // brand
                "SlimBook 2024",          // model
                1.3,                      // weight (in kg)
                "2560x1600",              // resolution
                "Windows 11",             // OS
                "Fan-Cooled",             // coolingSystem
                false,                    // customBuild
                60,                       // refreshRate (Hz)
                10,                       // battery (hours)
                true,                     // touchscreen
                50                        // bph (battery per hour)
        );
        PC gamingPC = new PC(
                1500.00,                  // price
                15.6,                     // screenLengthInch
                9.0,                      // screenWidthInch
                "CustomBrand",            // brand
                "XtremeGaming",           // model
                8.0,                      // weight (in kg)
                "1920x1080",              // resolution
                "Windows 11",             // OS
                "Liquid-Cooled",          // coolingSystem
                true,                     // customBuild
                144,                      // refreshRate (Hz)
                750,                      // PSU (watts)
                500                       // wph (watts per hour)
        );
        devices.add(gamingPC);
        devices.add(smartTV);
        devices.add(ultrabook);
        devices.add(flagshipPhone);

        for (Device device : devices) {
            System.out.println(device);
        }
    }
}
