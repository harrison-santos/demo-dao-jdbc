//exceção personalizada para acesso a dados
package db;

public class DbException extends RuntimeException {
	
	//número de versão padrão do eclipse
	private static final long serialVersionUID = 1L;
	
	public DbException(String msg) {
		super(msg);//transmite para superclasse RuntimeException
	}
	

}
