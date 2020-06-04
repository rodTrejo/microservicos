package com.formacionbdi.springboot.app.usuarios;

import com.formacionbdi.springboot.app.commons.usuarios.models.entity.Role;
import com.formacionbdi.springboot.app.commons.usuarios.models.entity.Usuario;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Usuario.class, Role.class);

    }
}
