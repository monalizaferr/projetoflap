package br.com.fiap.exception;

public class DBException extends Exception {
	
	private static boolean whitableStackTrace;

	public DBException () {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DBException (String message , Throwable cause,
			boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression,
				whitableStackTrace);
		//TODO Auto-generated constructor stub
	}
	
	public DBException (String message,Throwable cause ) {
		super (message, cause);
		//TODO Auto-generated constructor stub
	}
	
	public DBException(String message) {
		super (message);
		//TODO Auto-generated constructor stub
	}
	
	public DBException(Throwable cause) {
		super (cause);
		//TODO Auto-generated constructor stub 
	}

}