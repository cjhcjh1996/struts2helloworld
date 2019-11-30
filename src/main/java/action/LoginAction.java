package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

//import com.opensymphony.xwork2.ActionSupport;

/**
 * @author cjh
 * @date 2019/11/28-16:48
 */
public class LoginAction implements Action {
    private String username;
    private String password;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override

    public String execute() throws Exception {
        ActionContext context = ActionContext.getContext();
        if("admin".equals(username)&&"111".equals(password)){
            context.put("usernamemsg",username);
            context.put("pwdmsg",password);
            context.put("successmsg","用户登录成功");
            this.msg = "hello "+username;
            System.out.println(msg+","+username+","+password);
            return SUCCESS;
        }
        else{
            context.put("errormsg","用户登录失败");
            return ERROR;
        }

    }
}
