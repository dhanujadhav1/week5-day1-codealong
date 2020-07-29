package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		System.out.println("1:Register Here");
		System.out.println("2:Login");
		int x;
		
		//obj
		RegisterPojo registerpojo= new RegisterPojo();
		RegisterDAO registerdao= new RegisterDAO();
		LoginPojo loginpojo = new LoginPojo();
		LoginDAO logindao = new LoginDAO();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		x=Integer.parseInt(br.readLine());
		switch (x)
		{
		case 1:  System.out.println("Enter first Name:");
				String firstname=br.readLine();
				System.out.println("Enter Last name:");
				String lastname=br.readLine();
				System.out.println("Enter User name:");
				String username=br.readLine();
				System.out.println("Enter Password");
				String password=br.readLine();
				System.out.println("Enter Email");
				String email=br.readLine();
				registerpojo.setFirstName(firstname);
				registerpojo.setLastName(lastname);
				registerpojo.setUserName(username);
				registerpojo.setPassword(password);
				registerpojo.setEmail(email);
				
				registerdao.addUser(registerpojo);
				break;
				
		case 2:
			System.out.println("Enter username ");
			String user=br.readLine();
			System.out.println("Enter password:");
			String pass=br.readLine();
			loginpojo.setUserName(user);
			loginpojo.setPassword(pass);
			if(logindao.validate(loginpojo)==true) {
				
				Luck luck = new Luck();
				luck.display();
			}
			else {
				System.out.println("Incorrect username and password:");
			}
			break;
			
			default:System.out.println("Enter validd no");
		}
		

	}

}
