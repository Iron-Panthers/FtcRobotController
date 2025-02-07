package org.firstinspires.ftc.team7316.subsystems;

import org.firstinspires.ftc.team7316.commands.TeleopIntake;
import org.firstinspires.ftc.team7316.maps.Hardware;
import org.firstinspires.ftc.team7316.util.commands.Command;
import org.firstinspires.ftc.team7316.util.subsystems.Subsystem;

public class IntakeSubsystem extends Subsystem {
    private double intakeSpeed = 1;
    private double outtakeSpeed = -1;
    @Override
    public void reset() {
        Hardware.instance.intakeMotor.setPower(0);
    }
    public void intake(){
        Hardware.instance.intakeMotor.setPower(intakeSpeed);
    }
    public void outtake(){
        Hardware.instance.intakeMotor.setPower(outtakeSpeed);
    }

    @Override
    public Command defaultAutoCommand() {
        return null;
    }

    @Override
    public Command defaultTeleopCommand() {
        return new TeleopIntake();
    }
}
