package com.proyectojava.proyecto.Controllers;

import com.proyectojava.proyecto.dao.UsuarioDao;
import com.proyectojava.proyecto.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class UsuarioController  {
  @Autowired
  UsuarioDao usuarioDao;

  @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
    Usuario usuario = new Usuario();
    usuario.setId(id);
    usuario.setNombre("Jasmir");
    usuario.setApellido("tellez");
    usuario.setEmail("jasmirtellez@hotmail.com");
    usuario.setTelefono("89962174");
    return usuario;
  }

  @RequestMapping(value = "usuarios")
  public List<Usuario> getUsuarios(){
    List<Usuario> usuarios = new ArrayList<>();
    Usuario usuario = new Usuario();
    usuario.setId(234L);
    usuario.setNombre("Jasmir");
    usuario.setApellido("tellez");
    usuario.setEmail("jasmirtellez@hotmail.com");
    usuario.setTelefono("89962174");

    Usuario usuario2 = new Usuario();
    usuario2.setId(345L);
    usuario2.setNombre("Jason");
    usuario2.setApellido("aguilar");
    usuario2.setEmail("jasonaguilar@hotmail.com");
    usuario2.setTelefono("36210294");

    Usuario usuario3 = new Usuario();
    usuario3.setId(12L);
    usuario3.setNombre("Johan");
    usuario3.setApellido("Duarte");
    usuario3.setEmail("johanduarte@hotmail.com");
    usuario3.setTelefono("35029621");

    usuarios.add(usuario);
    usuarios.add(usuario2);
    usuarios.add(usuario3);
    return usuarios;
  }
  @RequestMapping(value = "usuario45")
  public Usuario editar(){
    Usuario usuario = new Usuario();
    usuario.setNombre("Jasmir");
    usuario.setApellido("tellez");
    usuario.setEmail("jasmirtellez@hotmail.com");
    usuario.setTelefono("89962174");
    return usuario;

  }
  @RequestMapping(value = "usuario343")
  public Usuario eliminar(){
    Usuario usuario = new Usuario();
    usuario.setNombre("Jasmir");
    usuario.setApellido("tellez");
    usuario.setEmail("jasmirtellez@hotmail.com");
    usuario.setTelefono("89962174");
    return usuario;

  }
  @RequestMapping(value = "usuario123")
  public Usuario buscar(){
    Usuario usuario = new Usuario();
    usuario.setNombre("Jasmir");
    usuario.setApellido("tellez");
    usuario.setEmail("jasmirtellez@hotmail.com");
    usuario.setTelefono("89962174");
    return usuario;

  }
}
