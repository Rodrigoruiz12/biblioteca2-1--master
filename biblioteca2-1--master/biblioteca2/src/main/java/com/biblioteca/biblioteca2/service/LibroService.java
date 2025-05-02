package com.biblioteca.biblioteca2.service;

import com.biblioteca.biblioteca2.model.Libro;
import com.biblioteca.biblioteca2.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;


@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;


    public int obtenerTotalLibros(){
        return libroRepository.totalLibros();
    }


    public Optional<Libro> buscarLibroPorIsbn(String isbn){
        return libroRepository.buscarPorIsbn(isbn);
    }


    public long contrarLibrosPorAnio(int anio){
        return libroRepository.contarPorAnio(anio);
    }


    public List<Libro> buscarPorAutor(String autor){
        return libroRepository.buscarPorAutor(autor);
    }


    public Optional<Libro> obtenerLibroMasAntiguo(){
        return libroRepository.libroMasAntiguo();
    }


    public Optional<Libro> obtenerLibroMasNuevo(){
        return libroRepository.libroMasNuevo();
    }


    public List<Libro> listarLibrosOrdenadosPorAnio(){
        return libroRepository.listarOrdenadosPorAnio();
    }




}
