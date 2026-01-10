package frc.robot;

import static edu.wpi.first.units.Units.MetersPerSecond;

import java.io.File;

import edu.wpi.first.units.measure.LinearVelocity;
import edu.wpi.first.wpilibj.Filesystem;

public final class Constants {
    public static class SwerveConstants {
        public static final File SWERVE_DIRECTORY = new File(Filesystem.getDeployDirectory(), "swerve");
        public static final LinearVelocity MAX_SPEED = MetersPerSecond.of(10);
    }
}
