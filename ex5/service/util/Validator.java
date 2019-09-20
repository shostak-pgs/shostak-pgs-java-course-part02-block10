package by.htp.part02.block10.ex5.service.util;

public class Validator {
	public static boolean isPackageValid(String command) {
		boolean ret = false;
		if (command.contentEquals("film") || command.contentEquals("box") || 
			command.contentEquals("cloth") || command.contentEquals("paper")) {
		ret = true;
		} 
		return ret;
    }
}
