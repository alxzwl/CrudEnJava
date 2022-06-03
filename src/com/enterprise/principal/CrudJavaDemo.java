package com.enterprise.principal;
import com.enterprise.controller.ControllerCliente;
import com.enterprise.model.Cliente;

public class CrudJavaDemo {

	public static void main(String[] args) {

		// controlador
		ControllerCliente controller = new ControllerCliente();

		// ver clientes
		controller.verClientes();

		// guarda un cliente a través del controlador
		Cliente cliente = new Cliente("Alex", "Barcenas", "117");
		controller.registrar(cliente);

		// editar un cliente por medio del id
		cliente.setId(1);
		cliente.setNombre("Fidel");
		controller.actualizar(cliente);

		// eliminar un cliente por medio del id
		cliente.setId(1);
		controller.eliminar(cliente);

	}

}
