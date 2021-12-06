package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;

class FeederSubsystem extends PIDSubsystem {

    private TalonFX

    //set the output for the PID (desired output)
    @Override
    protected void useOutput(double output, double setpoint) {
         double feedforward = 
    }

    @Override
    protected double getMeasurement() {
        return encoder.getDistance();
    }
}