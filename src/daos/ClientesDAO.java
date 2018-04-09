package daos;

import java.util.List;

import modelo.Cliente;

public interface ClientesDAO {

	List<Cliente> listarCliente();

	boolean identificarAdmin(String usuario, String contraseña);

	void registrarCliente(Cliente registro);

	Cliente obtenerCLientePorId(int id);

	void guardarCamiosCliente(Cliente cliente);

	Cliente borrarClienteId(int id);

}
