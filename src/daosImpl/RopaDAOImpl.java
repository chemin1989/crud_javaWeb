package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import daos.ConstantesSQL;
import daos.GenericDAO;
import daos.RopaDAO;
import modelo.Ropa;
import tools.FileManager;

public class RopaDAOImpl extends GenericDAO implements RopaDAO {

	public void registrarRopa(Ropa registroRopa) {
		conectar();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.INSERTAR_ROPA,
					Statement.RETURN_GENERATED_KEYS);

			ps.setString(1, registroRopa.getMarca());
			ps.setString(3, registroRopa.getModelo());
			ps.setString(2, registroRopa.getPais());
			ps.setString(4, registroRopa.getCoste());
			ps.setString(5, registroRopa.getTalla());
			ps.setString(6, registroRopa.getColor());
			ps.setString(7, registroRopa.getDescripcion());
			ps.execute();

			ResultSet rs = ps.getGeneratedKeys();
			if (rs.next()) {
				int idGen = rs.getInt(1);
				System.out.println("id generado en DB " + idGen);
				FileManager.guardarArchivo(registroRopa.getImagenSubida(), idGen + ".jpg");
			}

			ps.close();

		} catch (SQLException e) {
			System.out.println("Se EJECUTA LA SQL INSERTAR_ROPA");
			System.out.println(e.getMessage());
		}
		desconectar();
	}

	@Override
	public List<Ropa> obtenerRopa() {
		conectar();
		List<Ropa> ropa = new ArrayList<Ropa>();

		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.LISTAR_ROPA);
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				Ropa prendas = new Ropa();
				prendas.setColor(result.getString("color"));
				prendas.setModelo(result.getString("modelo"));
				prendas.setMarca(result.getString("marca"));
				prendas.setTalla(result.getString("talla"));
				prendas.setPais(result.getString("pais"));
				prendas.setDescripcion(result.getString("descripcion"));
				prendas.setId(result.getInt("id"));
				prendas.setCoste(result.getString("coste"));
				prendas.setRutaImagen(FileManager.rutaArchivo(result.getInt("id")));
				ropa.add(prendas);
			}
			ps.close();
			result.close();
		} catch (SQLException e) {
			System.out.println("Se EJECUTA LA SQL LISTAR ROPA");
			System.out.println(e.getMessage());

		}
		desconectar();

		return ropa;
	}

	@Override
	public Ropa obtenerRopaPorID(int id) {
		Ropa ropa = new Ropa();
		conectar();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.OBTENER_ROPA_POR_ID);
			ps.setInt(1, id);
			ResultSet result = ps.executeQuery();
			if (result.next()) {

				ropa.setMarca(result.getString("marca"));
				ropa.setModelo(result.getString("modelo"));
				ropa.setPais(result.getString("pais"));
				ropa.setCoste(result.getString("coste"));
				ropa.setTalla(result.getString("talla"));
				ropa.setColor(result.getString("color"));
				ropa.setDescripcion(result.getString("descripcion"));
				ropa.setId(id);
			}
			ps.close();

		} catch (SQLException e) {
			System.out.println("Se EJECUTA LA SQL OBTENER_ROPA_POR_ID ");
			System.out.println(e.getMessage());

		}

		desconectar();
		return ropa;
	}

	@Override
	public void guardarCambiosRopa(Ropa ropa) {
		conectar();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.GUARDAR_CAMIOS_ROPA);
			System.out.println("lanzaremos: " + ConstantesSQL.GUARDAR_CAMIOS_ROPA);
			ps.setString(1, ropa.getMarca());
			ps.setString(2, ropa.getModelo());
			ps.setString(3, ropa.getPais());
			ps.setString(4, ropa.getCoste());
			ps.setString(5, ropa.getTalla());
			ps.setString(6, ropa.getColor());
			ps.setString(7, ropa.getDescripcion());
			ps.setInt(8, ropa.getId());
			ps.execute();
			ps.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Se EJECUTA LA SQL GUARDAR_CAMBIOS_ROPA");

		}
		desconectar();
	}

	@Override
	public Ropa borrarRopaPorID(int id) {
		conectar();

		try {

			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.BORRAR_ROPA_POR_ID);
			ps.setInt(1, id);
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("Se EJECUTA LA SQL BORRAR_ANUNCIO");
		}
		desconectar();
		return null;
	}

}
