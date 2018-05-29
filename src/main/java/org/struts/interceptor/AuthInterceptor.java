package org.struts.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthInterceptor extends AbstractInterceptor{

	private static final long serialVersionUID = 6946121941305149397L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//获取session
		ActionContext context = ActionContext.getContext();
		
		Map<String, Object> session = context.getSession();
		
		if (session.get("userInfo") != null) { // 登录成功
            String result = invocation.invoke();
            return result;
        } else {// 未登录
            session.put("loginError", "请先登录");
            return "login";
        }
	}

}
