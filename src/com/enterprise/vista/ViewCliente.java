package com.enterprise.vista;

import java.util.List;

import com.enterprise.model.Cliente;

public class ViewCliente {

	public void verCliente(Cliente cliente) {
		System.out.println("Datos del cliente: " + cliente);
	}

	public void verClientes(List<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			System.out.println("Datos del cliente: " + cliente);
		}
	}
}
