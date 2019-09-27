package by.htp.part02.block10.ex5var.service.util;

public class Validator {
	public static boolean isPackageValid(String command) {
		boolean ret = false;
		if (command.contentEquals("film") || command.contentEquals("box") || 
			command.contentEquals("cloth") || command.contentEquals("paper")) {
		ret = true;
		} 
		return ret;
    }
	
	public static boolean isPlantValid(String command) {
		boolean ret = false;
		if (command.contentEquals("rose") || command.contentEquals("tulip") || 
			command.contentEquals("clove") || command.contentEquals("asp")  ||
		    command.contentEquals("berg")) {
		ret = true;
		} 
		return ret;
    }
}
