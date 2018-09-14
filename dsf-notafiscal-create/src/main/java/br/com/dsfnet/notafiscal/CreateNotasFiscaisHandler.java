package br.com.dsfnet.notafiscal;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import br.com.dsfnet.dao.notafiscal.NotaFiscalDAO;
import br.com.dsfnet.notafiscal.dynamodb.entity.NotaFiscal;
import br.com.dsfnet.notafiscal.lambda.response.HandlerResponse;

public class CreateNotasFiscaisHandler implements RequestHandler<NotaFiscal, HandlerResponse> {

	private NotaFiscalDAO dao = NotaFiscalDAO.getInstance();
	
	@Override
	public HandlerResponse handleRequest(final NotaFiscal newNotaFiscal, final Context context) {
		context.getLogger().log("[#] - Iniate registry");
		
		final NotaFiscal notaFiscal = dao.save(newNotaFiscal);
		
		final HandlerResponse response = HandlerResponse.builder()
				.setStatusCode(200)
				.setObjectBody(notaFiscal)
				.build(); 
		
		context.getLogger().log("[#] - NotaFiscal registered successfully");
		
		return response;

	}
}
