package action;

import com.opensymphony.xwork2.Action;
import vo.User;

/**
 * @author cjh
 * @date 2019/11/28-12:34
 */
public class HelloAction implements Action {
    private static final long serialVersionUID = 1L;
    private String name;
    private String msg;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("接收到的name是："+name);
        System.out.println("hello world");
        msg = "hello action haha";

        System.out.println("userinfo:"+user);
        return SUCCESS;
    }

    public String login() throws Exception{
        System.out.println("hello world--login");
        System.out.println("userinfo:"+user);
        return SUCCESS;
    }
}
