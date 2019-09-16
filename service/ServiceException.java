package by.htp.part02.block10.ex4.dragon_cave.service;

public class ServiceException extends Exception {

	public ServiceException() {
		super();
	}
	
	public ServiceException(String str) {
		super(str);
	}
	
	public ServiceException(Exception e) {
		super(e);
	}
	
}
