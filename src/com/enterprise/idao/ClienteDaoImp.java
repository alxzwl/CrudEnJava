package com.enterprise.idao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.enterprise.connection.Conexion;
import com.enterprise.dao.IClienteDao;
import com.enterprise.model.Cliente;

public class ClienteDaoImp implements IClienteDao {

	@Override
	public String registrar(Cliente cliente) {
		Connection conexion = null;
		try {
			String query = "INSERT INTO clientes VALUES(NULL,'" + cliente.getNombre() + "','" + cliente.getApellido()
					+ "','" + cliente.getCedula() + "')";
			conexion = Conexion.getConnection();
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(query);
			if (rs != null) {
				System.out.println("Registro insertado de forma exitosa");
			} else {
				System.out.println("Error al ingresar datos BBDD");
			}

			// Libera recursos
			st.close();
			// Libera recursos
			rs.close();
			// Libera recursos
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Redireccionar a la vista";
	}

	@Override
	public List<Cliente> obtenerClientes() {
		Connection conexion = null;
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		try {
			String query = "SELECT * FROM clientes ORDER BY id";
			conexion = Conexion.getConnection();
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				Cliente c = new Cliente();
				c.setId(rs.getInt(1));
				c.setNombre(rs.getString(2));
				c.setApellido(rs.getString(3));
				c.setCedula(rs.getString(4));
				listaCliente.add(c);
			}
			// Libera recursos
			st.close();
			// Libera recursos
			rs.close();
			// Libera recursos
			conexion.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaCliente;
	}

	@Override
	public String actualizarCliente(Cliente cliente) {
		Connection conexion = null;
		try {
			conexion = Conexion.getConnection();
			String query = "UPDATE cliente SET nombre='" + cliente.getNombre() + "', apellidos='"
					+ cliente.getApellido() + "',cedula='" + cliente.getCedula() + "'" + "WHERE id =" + cliente.getId();
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(query);
			if (rs != null) {
				System.out.println("Actualizacion Exitosa");
			} else {
				System.out.println("Error al actualizar");
			}

			// Libera recursos
			st.close();
			// Libera recursos
			rs.close();
			// Libera recursos
			conexion.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Reedireccionar a la vista";
	}

	@Override
	public void eliminar(Cliente cliente) {
		Connection conexion = null;
		try {
			conexion = Conexion.getConnection();
			String query = "DELETE FROM clientes WHERE id =" + cliente.getId();
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(query);

			if (rs != null) {
				System.out.println("Se ha borrado un registro de forma exitosa");
			} else {
				System.out.println("Error al borrar un registro BBDD");
			}

			// Libera recursos
			st.close();
			// Libera recursos
			rs.close();
			// Libera recursos
			conexion.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
