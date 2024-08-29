package deviceTask;

import java.util.ArrayList;
import java.util.Arrays;

public class DeviceShop {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("IPhone 16", 1199, "Blue", true, true, 555555555);
        Samsung samsung = new Samsung("Galaxy S16", 1099, "Black", true, true, 555555556);
        Google google = new Google("Ultra", 999, "White", true, true, 555555557);

        Dell dell = new Dell("X", 1299, "Gray", true, true, "16");
        MacBookAir macBookAir = new MacBookAir("M3 Chip", 1399, "Black", true, true, "16");

        System.out.println(iPhone);
        System.out.println(samsung);

        ArrayList<Device> devices = new ArrayList<>(Arrays.asList(iPhone, samsung, google, dell, macBookAir));

        //TODO: show me the most expensive device

        double mostExpensiveDevice = devices.get(0).getPrice();

        for (Device each : devices) {
            if (each.getPrice() > mostExpensiveDevice) {
                mostExpensiveDevice = each.getPrice();
            }
        }

        System.out.println(mostExpensiveDevice);

        System.out.println("----------------------------");

        //TODO: show me all Phones

        for (Device each : devices) {
            if (each instanceof Phone) {
                System.out.println(each.getBrand() + " : " + each.getModel() + " $" + each.getPrice());
            }
        }

        System.out.println("----------------------------");

        //TODO: show me all Computers

        for (Device each : devices) {
            if (each instanceof Computer) {
                System.out.println(each.getBrand() + " : " + each.getModel() + " $" + each.getPrice());
            }
        }

        Device phone = new IPhone("IPhone 15", 1099, "Purple", true, true, 555555551);
        Device phone2 = new Samsung("IPhone 15", 1099, "Purple", true, true, 555555551);

        ( (IPhone)phone ).getPhoneNumber();
        phone.turnOn();
        phone2.turnOn();

        // phone.setPhoneNumber();
        // ((IPhone) phone).setPhoneNumber(556787327);

    }
}
/*
9. Create a Class Named 'DeviceShop':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.
 */