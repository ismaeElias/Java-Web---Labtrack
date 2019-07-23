package com.ismaelElias.lavanderia.service;


import com.ismaelElias.lavanderia.models.Cliente;
import com.ismaelElias.lavanderia.utils.GenericDao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class ClienteService extends AbstractService<Cliente> {

	@Inject
	private GenericDao<Cliente> dao;

	@Override
	protected GenericDao<Cliente> getDao() {
		return dao;
	}
}
