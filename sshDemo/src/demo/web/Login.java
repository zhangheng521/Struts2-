package demo.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class Login implements Action{

	@Override
	public String execute() throws Exception {

        HttpServletRequest request=ServletActionContext.getRequest();
        String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if (username !=null && !"".equals(username) && password !=null
				&& !"".equals(password)) {
			
			if (username.equals("zhangsan")&& password.equals("123")) {
				request.setAttribute("user",username);
				return Action.SUCCESS;
			}else return Action.ERROR;
			
		}
		return Action.NONE;
	}

}
