package com.ismaelElias.lavanderia.resources;

import com.ismaelElias.lavanderia.models.OrdemServico;
import com.ismaelElias.lavanderia.service.AbstractService;
import com.ismaelElias.lavanderia.service.OrdemServicoService;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/ordens")
public class OrdemServicoResource extends AbstractResource<OrdemServico> {

	@Inject
	private OrdemServicoService service;

	@Override
	protected AbstractService<OrdemServico> getService() {
		return service;
	}

}
