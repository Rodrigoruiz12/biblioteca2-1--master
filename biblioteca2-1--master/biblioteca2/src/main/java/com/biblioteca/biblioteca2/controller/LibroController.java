package com.biblioteca.biblioteca2.controller;

import com.biblioteca.biblioteca2.model.Libro;
import com.biblioteca.biblioteca2.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping("/total")
    public int totallibros(){
        return libroService.obtenerTotalLibros();
    }

    @GetMapping("/buscar/isbn/{isbn}")
    public Optional<Libro> buscarPorIsbn(@PathVariable String isbn){
        return libroService.buscarLibroPorIsbn(isbn);
    }

    @GetMapping("/buscar/anio/{anio}")
    public long contarPorAnio(@PathVariable int anio){
        return libroService.contrarLibrosPorAnio(anio);
    }

    @GetMapping("/buscar/autor/{autor}")
    public List<Libro> buscarPorAutor(@PathVariable String autor){
        return libroService.buscarPorAutor(autor);
    }

    @GetMapping("/buscar/antiguo")
    public Optional<Libro> libroMasAntiguo(){
        return libroService.obtenerLibroMasAntiguo();
    }


    @GetMapping("/buscar/nuevoo")
    public Optional<Libro> libroMasNuevo(){
        return libroService.obtenerLibroMasNuevo();
    }


    @GetMapping("/listar/ordenado")
    public List<Libro> listarOrdenadosPorAnio(){
        return libroService.listarLibrosOrdenadosPorAnio();
    }

}
