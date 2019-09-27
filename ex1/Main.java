package by.htp.part02.block10.ex1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
		TextFile file = new TextFile("D:\\javaFile12356.txt", "name");
		file.addContent("str");
		file.setName("d");
	    file.print();
	    System.out.println(file);
	}
}
