package daosImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import daos.ConstantesSQL;
import daos.GenericDAO;
import daos.UsuariosDAO;

import modelo.Usuario;

public class UsuariosDAOImpl extends GenericDAO implements UsuariosDAO {

	@Override
	public void registrarUsuario(Usuario registro) {
		conectar();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.SQL_REGISTRO_USUARIO);
			ps.setString(1, registro.getNombre());
			ps.setString(2, registro.getEmail());
			ps.setString(3, registro.getComentario());
			ps.execute();
			ps.close();

		} catch (SQLException e) {
			System.out.println("SQL REGISTRO ROPA: " + e.getMessage());
			e.printStackTrace();
		}

		desconectar();

	}

	@Override
	public List<Usuario> listarUsuario() {
		conectar();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try {
			PreparedStatement ps = miConexion.prepareStatement(ConstantesSQL.SQL_LISTAR_USUARIO);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setNombre(rs.getString("nombre"));
				usuario.setEmail(rs.getString("email"));
				usuario.setComentario(rs.getString("comentario"));
				usuario.setId(rs.getInt("id"));
				usuarios.add(usuario);

			}
		} catch (SQLException e) {

			System.out.println("SQL REGIETRO ROPA " + e.getMessage());
		}
		desconectar();

		return usuarios;
	}

}
