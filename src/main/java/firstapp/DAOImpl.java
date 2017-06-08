package firstapp;

import org.springframework.stereotype.Component;

@Component
public class DAOImpl implements DAO 
{

	public void C(int a) {
		System.out.println("create"+a);

	}

	public void R(int a) {
		System.out.println("read"+a);		
	}

	public void U(int a) {
		System.out.println("update"+a);		
	}

	public void D(int a) {
		System.out.println("delete"+a);		
	}

}
