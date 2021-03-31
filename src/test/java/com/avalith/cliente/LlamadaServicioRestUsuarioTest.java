package com.avalith.cliente;

import com.avalith.factories.AlbumsFactory;
import com.avalith.factories.UsuariosFactory;
import com.avalith.modelo.Usuario;
import com.avalith.servicio.UsuarioServicio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class LlamadaServicioRestUsuarioTest {

  @MockBean
  LlamadaServicioRestUsuario llamadaServicioRestUsuario;

  private Usuario usuario;

  @BeforeEach
  public void setUp() {
    usuario = UsuariosFactory.buildOne();
  }

  @Test
  void llamadaUsuario() {
    String id="0";
    Mockito.when(llamadaServicioRestUsuario.llamadaUsuario(id)).thenReturn(usuario);
    Assertions.assertEquals(Integer.parseInt(id), llamadaServicioRestUsuario.llamadaUsuario(id).getId());
  }
}