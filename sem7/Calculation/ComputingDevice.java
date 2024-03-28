package SEM7.Calculation;

import SEM7.Calculation.Calculation;
import SEM7.Interface.Calculable;
import SEM7.Interface.IComputingDevice;

public class ComputingDevice implements IComputingDevice {
    @Override
    public Calculable create(float primaryArg) {
        return new Calculation(primaryArg);
    }
}