package com.ismaelElias.lavanderia.resources;

import com.ismaelElias.lavanderia.models.Item;
import com.ismaelElias.lavanderia.service.AbstractService;
import com.ismaelElias.lavanderia.service.ItemService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/itens")
public class ItemResource extends AbstractResource<Item> {

	@Inject
	private ItemService service;

	@Override
	protected AbstractService<Item> getService() {
		return service;
	}

}
