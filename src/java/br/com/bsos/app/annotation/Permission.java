package br.com.bsos.app.annotation;

import br.com.bsos.app.modelo.util.TipoPerfil;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
public @interface Permission {

	public TipoPerfil[] value();

        
}