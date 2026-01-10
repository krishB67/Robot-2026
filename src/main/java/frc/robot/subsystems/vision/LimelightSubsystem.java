package frc.robot.subsystems.vision;

import static edu.wpi.first.units.Units.Degree;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.libraries.LimelightHelpers;

public class LimelightSubsystem extends SubsystemBase {
    
    public LimelightSubsystem() {

    }

    @Override
    public void periodic() {
        LimelightHelpers.SetRobotOrientation("limelight", RobotContainer.swerveSubsystem.getNavXAngle().in(Degree), 0.0, 0.0, 0.0, 0.0, 0.0);
        

    }

    public void getVisionEstimate() {
        
    }
}
