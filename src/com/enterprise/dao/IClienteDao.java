package com.enterprise.dao;

import java.util.List;

import com.enterprise.model.Cliente;

public interface IClienteDao {

	public String registrar(Cliente cliente);

	public List<Cliente> obtenerClientes();

	public String actualizarCliente(Cliente cliente);

	public void eliminar(Cliente cliente);
}
