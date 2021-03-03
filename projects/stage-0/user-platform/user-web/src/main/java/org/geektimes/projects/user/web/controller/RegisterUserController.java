package org.geektimes.projects.user.web.controller;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.service.UserServiceImp;
import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;


@Path("/register")
public class RegisterUserController implements PageController {

    private static UserServiceImp userServiceImp;
    static{
        userServiceImp = new UserServiceImp();
    }

    @POST
    @Path("/add") // /hello/world -> HelloWorldController
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setPassword(request.getParameter("password"));
        user.setEmail(request.getParameter("email"));
        user.setPhoneNumber(request.getParameter("phoneNumber"));
        System.out.println("the post body value is: " + user.toString());
        boolean addUser = userServiceImp.register(user);
        System.out.println("add user: " + addUser);
        request.setAttribute("name",request.getParameter("name"));
        return "registerSuccess.jsp";
    }
}
