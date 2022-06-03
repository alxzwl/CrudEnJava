package com.enterprise.controller;

import java.util.ArrayList;
import java.util.List;

import com.enterprise.dao.IClienteDao;
import com.enterprise.idao.ClienteDaoImp;
import com.enterprise.model.Cliente;
import com.enterprise.vista.ViewCliente;

public class ControllerCliente {

	private ViewCliente vista = new ViewCliente();

	public ControllerCliente() {
	}

	public void registrar(Cliente cliente) {
		// List<Cliente> clientes = new ArrayList<Cliente>();
		IClienteDao dao = new ClienteDaoImp();
		dao.registrar(cliente);
		// vista.verClientes(clientes);
	}

	public void actualizar(Cliente cliente) {
		// List<Cliente> clientes = new ArrayList<Cliente>();
		IClienteDao dao = new ClienteDaoImp();
		dao.actualizarCliente(cliente);
		// vista.verClientes(clientes);
	}

	public void eliminar(Cliente cliente) {
		// List<Cliente> clientes = new ArrayList<Cliente>();
		IClienteDao dao = new ClienteDaoImp();
		dao.eliminar(cliente);
		// vista.verClientes(clientes);
	}

	public void verClientes() {
		List<Cliente> clientes = new ArrayList<Cliente>();
		IClienteDao dao = new ClienteDaoImp();
		dao.obtenerClientes();
		vista.verClientes(clientes);
	}

}
