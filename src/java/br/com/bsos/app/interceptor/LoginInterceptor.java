package br.com.bsos.app.interceptor;

import br.com.bsos.app.component.UserSession;
import br.com.bsos.app.controller.LoginController;
import java.util.Arrays;

import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.resource.ResourceMethod;


@Intercepts(before = PermissionInterceptor.class)
public class LoginInterceptor implements Interceptor {

    private final Result result;
    private final UserSession userSession;

    public LoginInterceptor(Result result, UserSession userSession) {
        this.result = result;
        this.userSession = userSession;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean accepts(ResourceMethod method) {
        return !Arrays.asList(LoginController.class).contains(method.getMethod().getDeclaringClass());
      
    }

    @Override
    public void intercept(InterceptorStack stack, ResourceMethod method, Object resource) {
        if (userSession.isLogged()) {
            stack.next(method, resource);
        } else {
            result.redirectTo(LoginController.class).login();
        }

    }
}