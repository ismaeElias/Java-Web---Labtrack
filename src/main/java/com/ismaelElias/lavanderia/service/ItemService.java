package com.ismaelElias.lavanderia.service;



import com.ismaelElias.lavanderia.models.Item;
import com.ismaelElias.lavanderia.utils.GenericDao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class ItemService extends AbstractService<Item> {

    @Inject
    private GenericDao<Item> dao;
    
    @Override
    protected GenericDao<Item> getDao() {
        return dao;
    }
    
}
