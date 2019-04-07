package co.simplon.entities;

public class Users {
	private int IdUser;
	private String Login;
	private String Password;
	private int ConnectionNumber;
	public Users(int IdUser,String Login,String Password,int ConnectionNumber) {
		this.IdUser=IdUser;
		this.Login=Login;
		this.Password=Password;
		this.ConnectionNumber=ConnectionNumber;
	}
	public int getIdUser() {
		return IdUser;
	}
	public void setIdUser(int idUser) {
		IdUser = idUser;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getConnectionNumber() {
		return ConnectionNumber;
	}
	public void setConnectionNumber(int connectionNumber) {
		ConnectionNumber = connectionNumber;
	}
	@Override
	public String toString() {
		return "Users [IdUser=" + IdUser + ", Login=" + Login + ", Password=" + Password + ", ConnectionNumber="
				+ ConnectionNumber + "]";
	}
	
}
