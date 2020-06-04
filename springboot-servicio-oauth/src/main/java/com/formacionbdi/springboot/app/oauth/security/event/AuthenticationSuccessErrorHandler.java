package com.formacionbdi.springboot.app.oauth.security.event;

import com.formacionbdi.springboot.app.commons.usuarios.models.entity.Usuario;
import com.formacionbdi.springboot.app.oauth.services.IUsuarioService;
import feign.FeignException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationSuccessErrorHandler implements AuthenticationEventPublisher {

    private Logger log = LoggerFactory.getLogger(AuthenticationSuccessErrorHandler.class);

    @Autowired
    private IUsuarioService usuarioService;

    @Override
    public void publishAuthenticationSuccess(Authentication authentication) {
        UserDetails user =  (UserDetails)authentication.getPrincipal();
        String mensaje = "Succes Login: "+user.getUsername();
        System.out.println(mensaje);
        System.out.println(user);
        System.out.println(authentication);
        log.info(mensaje);

        //Usuario usuario = usuarioService.findByUsername(authentication.getName());
        //if(usuario.getIntentos() != null && usuario.getIntentos() > 0){
        //    usuario.setIntentos(0);
        //    usuarioService.update(usuario, usuario.getId());
        //}
    }

    @Override
    public void publishAuthenticationFailure(AuthenticationException e, Authentication authentication) {
        String mensaje = "Error en el Login: "+e.getMessage();
        log.error(mensaje);
        System.out.println(mensaje);

        /*try{
            Usuario usuario = usuarioService.findByUsername(authentication.getName());
            if(usuario.getIntentos() == null){
                usuario.setIntentos(0);
            }
            log.info("Intentos actual es de: "+usuario.getIntentos());
            usuario.setIntentos(usuario.getIntentos() + 1);
            log.info("Intentos después es de: "+usuario.getIntentos());
            if(usuario.getIntentos() >= 3 ){
                usuario.setEnabled(false);
                log.info(String.format("El usuario %s des-habilitado por máximos intentos", usuario.getNombre()));
            }
            usuarioService.update(usuario, usuario.getId());
        }catch (FeignException exception){
            log.error(String.format("El usuario %s no existe en el sistema", authentication.getName()));
        }*/

    }
}
