package by.htp.part02.block10.ex5var.service;

public class ServiceException extends Exception{
	
	public ServiceException() {
		super();
	}
	
	public ServiceException(String message) {
		super(message);
	}
	
	public ServiceException(Exception e) {
		super(e);
	}
}
