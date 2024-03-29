package com.formacionbdi.springboot.app.item.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import com.formaciondi.springboot.app.commons.models.entity.Producto;

@FeignClient(name = "servicio-productos")
public interface ProductoClienteRest {

    @GetMapping("/listar")
    public List<Producto> listar();

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable Long id);

    @PostMapping("/crear")
    public Producto crear (@RequestBody Producto producto);

    @PutMapping("/editar/{id}")
    public Producto update(@RequestBody Producto producto, @PathVariable Long id);

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id);

}
