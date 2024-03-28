package SEM7;

import SEM7.Calculation.ComputingDevice;
import SEM7.View.ViewCalculator;

public class main {
    public static void main(String[] args) {
        ComputingDevice computingDevice = new ComputingDevice();
        ViewCalculator viewCalculator = new ViewCalculator(computingDevice);
        viewCalculator.run();
    }
}