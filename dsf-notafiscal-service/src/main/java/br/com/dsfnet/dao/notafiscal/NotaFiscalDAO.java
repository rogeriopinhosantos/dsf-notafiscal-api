package br.com.dsfnet.dao.notafiscal;

import java.util.Optional;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import br.com.dsfnet.notafiscal.dynamodb.entity.NotaFiscal;
import br.com.dsfnet.notafiscal.dynamodb.manager.DynamoDBManager;

public class NotaFiscalDAO {

	private static final DynamoDBMapper mapper = DynamoDBManager.mapper();

	private static NotaFiscalDAO instance;

	private NotaFiscalDAO() { 
	}

	public static NotaFiscalDAO getInstance() {
		if (instance == null) {
			instance = new NotaFiscalDAO();
		}
		return instance;
	}

	public NotaFiscal find(final String id) {
		final NotaFiscal notafiscal = mapper.load(NotaFiscal.class, id);
		return Optional.ofNullable(notafiscal).get();
	}

	public NotaFiscal save(final NotaFiscal notafiscal) {
		mapper.save(notafiscal);
		return notafiscal;
	}

	public void delete(NotaFiscal input) {
		mapper.delete(input);
	}

}
