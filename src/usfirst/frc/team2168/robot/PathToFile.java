package usfirst.frc.team2168.robot;

import java.io.*;

public class PathToFile {
	public static void printToCSV(double[][] rightVelocity, double[][] leftVelocity, double refresh) throws FileNotFoundException{
		PrintWriter pw = new PrintWriter(new File("Velocities.csv"));
		StringBuilder sb = new StringBuilder();
		sb.append("Left Velocity (ft/s)");
		sb.append(',');
		sb.append("Right Velocity (ft/s)");
		sb.append(',');
		sb.append("Refresh Rate (ms)");
		sb.append('\n');
		
		for(int i = 0; i < leftVelocity.length; i++){
			sb.append(leftVelocity[i][1]);
			sb.append(',');
			sb.append(rightVelocity[i][1]);
			sb.append(',');
			sb.append(refresh);
			sb.append('\n');
		}
		
		pw.write(sb.toString());
		pw.close();
	}
}
