package br.com.dsfnet.notafiscal.lambda.exception;

public class NotaFiscalNotFoundException extends RuntimeException {

	public NotaFiscalNotFoundException() {
		super();
	}

	public NotaFiscalNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NotaFiscalNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotaFiscalNotFoundException(String message) {
		super(message);
	}

	public NotaFiscalNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
