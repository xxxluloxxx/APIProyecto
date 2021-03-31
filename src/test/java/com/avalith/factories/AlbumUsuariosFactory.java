package com.avalith.factories;


import com.avalith.modelo.AlbumUsuario;
import com.avalith.modelo.Usuario;
import java.util.Arrays;
import java.util.List;

public class AlbumUsuariosFactory {

    public static List<AlbumUsuario> build() {
        return Arrays.asList(
            AlbumUsuario.builder().id(0).build(),
            AlbumUsuario.builder().id(1).build(),
            AlbumUsuario.builder().id(2).build()
        );
    }
}
