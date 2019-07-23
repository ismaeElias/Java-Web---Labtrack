package com.ismaelElias.lavanderia.resources;

import com.ismaelElias.lavanderia.models.Cliente;
import com.ismaelElias.lavanderia.service.AbstractService;
import com.ismaelElias.lavanderia.service.ClienteService;


import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/clientes")
public class ClienteResource extends AbstractResource<Cliente> {

    @Inject
    private ClienteService service;

    @Override
    protected AbstractService<Cliente> getService() {
        return service;
    }

}
