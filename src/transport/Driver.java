package transport;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    private final String name;

    private boolean haveDriversLicense;

    private int experience;

    public Driver(String name, boolean haveDriversLicense, int experience) {
        this.name = name;
        this.haveDriversLicense = haveDriversLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }


    public boolean isHaveDriversLicense() {
        return haveDriversLicense;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Driver " +
                "name = " + name +
                ", haveDriversLicense = " + haveDriversLicense +
                ", experience = " + experience;
    }
}
