package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import daos.ConstantesSQL;
import daos.GenericDAO;
import modelo.Cliente;
import daos.ClientesDAO;

public class ClientesDAOImpl extends GenericDAO implements ClientesDAO {

	@Override
	public boolean identificarAdmin(String usuario, String contraseña) {
		boolean iden = false;
		conectar();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.IDENTIFICAR_ADMIN);
			ps.setString(1, usuario);
			ps.setString(2, contraseña);
			ResultSet result = ps.executeQuery();

			if (result.next()) {

				iden = true;
			}

		} catch (SQLException e) {
			System.out.println("SE EJECUTA LA SQL IDENTIFICAR_USUARIO mens: " + e.getMessage());

		}

		desconectar();
		return iden;
	}

	@Override
	public void registrarCliente(Cliente registro) {
		conectar();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.REGISTRAR_CLIENTE);
			// public static final String REGISTRAR_CLIENTE = "insert into
			// tabla_clientes(nombre, apellidos, direccion, numero, poblacion, cp, email,
			// ep) "
			ps.setString(1, registro.getNombre());
			ps.setString(2, registro.getApellidos());
			ps.setString(3, registro.getDireccion());
			ps.setString(4, registro.getNumero());
			ps.setString(5, registro.getPoblacion());
			ps.setString(6, registro.getCp());
			ps.setString(7, registro.getEmail());
			ps.setString(8, registro.getEp());

			ps.execute();
			ps.close();

		} catch (SQLException e) {

			System.out.println("SE EJECUTA LA SQL LISTAR_CLIENTES Mens " + e.getMessage());
		}
		desconectar();

	}

	@Override
	public List<Cliente> listarCliente() {
		conectar();
		List<Cliente> clientes = new ArrayList<Cliente>();
		try {

			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.LISTAR_CLIENTES);
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				Cliente cliente = new Cliente();
				cliente.setNombre(result.getString("nombre"));
				cliente.setApellidos(result.getString("apellidos"));
				cliente.setDireccion(result.getString("direccion"));
				cliente.setNumero(result.getString("numero"));
				cliente.setPoblacion(result.getString("poblacion"));
				cliente.setCp(result.getString("cp"));
				cliente.setEmail(result.getString("email"));
				cliente.setEp(result.getString("ep"));
				cliente.setId(result.getInt("id"));
				clientes.add(cliente);

				// System.out.println("que hay en cliente" + cliente.toString()); resuelto
			}
		} catch (SQLException e) {
			System.out.println("SE EJECUTA LA SQL LISTAR_CLIENTES Mens " + e.getMessage());
		}
		desconectar();

		return clientes;
	}

	@Override
	public Cliente obtenerCLientePorId(int id) {
		Cliente clientes = new Cliente();
		conectar();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.OBTENER_CLIENTE_POR_ID);
			ps.setInt(1, id);
			ResultSet resulta = ps.executeQuery();
			if (resulta.next()) {

				clientes.setNombre(resulta.getString("nombre"));
				clientes.setApellidos(resulta.getString("apellidos"));
				clientes.setDireccion(resulta.getString("direccion"));
				clientes.setNumero(resulta.getString("numero"));
				clientes.setPoblacion(resulta.getString("poblacion"));
				clientes.setCp(resulta.getString("cp"));
				clientes.setEmail(resulta.getString("email"));
				clientes.setEp(resulta.getString("ep"));
				clientes.setId(resulta.getInt("id"));

			}
			ps.close();

		} catch (SQLException e) {
			System.out.println("SE EJECUTA OBTENER CLIENTE POR ID mas inf: " + e.getMessage());

			e.printStackTrace();
		}
		desconectar();
		return clientes;
	}

	@Override
	public void guardarCamiosCliente(Cliente cliente) {
		conectar();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.GUARDAR_CAMBIOS_CLIENTE_POR_ID);
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getApellidos());
			ps.setString(3, cliente.getDireccion());
			ps.setString(4, cliente.getNumero());
			ps.setString(5, cliente.getPoblacion());
			ps.setString(6, cliente.getCp());
			ps.setString(7, cliente.getEmail());
			ps.setString(8, cliente.getEp());
			ps.setInt(9, cliente.getId());
			ps.execute();
			ps.close();

		} catch (SQLException e) {
			System.out.println("GUARDAR_CAMBIOS_CLIENTE INFO: " + e.getMessage());

		}
		desconectar();

	}

	@Override
	public Cliente borrarClienteId(int id) {
		conectar();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.BORRAR_CLIENTE_POR_ID);
			ps.setInt(1, id);
			ps.execute();
			ps.close();

		} catch (SQLException e) {
			System.out.println("BORRAR CLIENTE POR ID INF: " + e.getMessage());

		}
		desconectar();

		return null;
	}

	
}
