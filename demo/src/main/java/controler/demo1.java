package controler;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Empdao;
import dto.Emp;
@WebServlet("/xyz")
public class demo1 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=req.getParameter("Eid");
		int eid=Integer.parseInt(s1);
		String ename=req.getParameter("Ename");
		
		Emp emp=new Emp();
		emp.setEid(eid);
		emp.setEname(ename);
		
		Empdao empdao=new Empdao();
		empdao.insert(emp);
		
	}

}
