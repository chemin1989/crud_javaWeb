package daos;

import java.util.List;

import modelo.Usuario;

public interface UsuariosDAO {

	void registrarUsuario(Usuario registro);
	
	List<Usuario> listarUsuario();
	
	
}
