package com.enterprise.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	public static Connection getConnection() {
		Connection miConexion = null;
		String user = "root";
		String pasw = "root";
		String jdbc = "jdbc:mysql://localhost:3306/crudenjava";
		try {
			// Establecer conexion
			Class.forName("com.mysql.jdbc.Driver");
			miConexion = DriverManager.getConnection(jdbc, user, pasw);
			if (miConexion != null) {
				System.out.println("!Conexion Exitosa!");
			} else {
				System.out.println("!Error en la conexion!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return miConexion;
	}
}
