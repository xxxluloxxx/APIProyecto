package com.avalith.factories;


import com.avalith.modelo.Usuario;
import java.util.Arrays;
import java.util.List;

public class UsuariosFactory {

    public static List<Usuario> build() {
        return Arrays.asList(
            Usuario.builder().email("a@a.com").id(0).name("user0").username("u0").build(),
            Usuario.builder().email("b@b.com").id(1).name("user1").username("u1").build(),
            Usuario.builder().email("c@c.com").id(2).name("user2").username("u2").build()
        );
    }

    public static Usuario buildOne() {
        return Usuario.builder().email("a@a.com").id(0).name("user0").username("u0").build();
    }
}
