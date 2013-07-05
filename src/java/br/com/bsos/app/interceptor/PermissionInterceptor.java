package br.com.bsos.app.interceptor;

import br.com.bsos.app.annotation.Permission;
import br.com.bsos.app.component.UserSession;
import br.com.bsos.app.controller.LoginController;
import br.com.bsos.app.controller.UsuarioController;
import br.com.bsos.app.modelo.Usuario;
import br.com.bsos.app.modelo.util.TipoPerfil;
import java.util.Arrays;
import java.util.Collection;

import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.resource.ResourceMethod;


@Intercepts(after = LoginInterceptor.class)
public class PermissionInterceptor implements Interceptor {

	private final Result result;
	private final UserSession userSession;
	
	public PermissionInterceptor(Result result, UserSession userSession) {
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
		Permission controllerList = method.getResource().getType().getAnnotation(Permission.class);
		Permission metodoList = method.getMethod().getAnnotation(Permission.class);

		if (this.hasAccess(metodoList) && this.hasAccess(controllerList)) {
			stack.next(method, resource);
		} else {
			result.redirectTo(UsuarioController.class).negado();
		}
	}

	private boolean hasAccess(Permission permissaoList) {
		if (permissaoList == null) {
			return true;
		}

		Usuario user = userSession.getUser();

		Collection<TipoPerfil> perfilList = Arrays.asList(permissaoList.value());

		return perfilList.contains(user.getPerfil());
	}

}