package practica1.example.practica.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import practica1.example.practica.model.Libro;
import practica1.example.practica.service.LibroService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")

public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listarLibros(){
        return libroService.getLibros();
    }
    @PostMapping
    public  Libro agregarLibro (@RequestBody Libro libro){
        return libroService.saveLibro(libro);
    }

    @GetMapping("{id}")
    public Libro buscarLibro(@PathVariable int id){
        return  libroService.getLibroId(id);
    }

    @PutMapping("{id}")
    public Libro actualizarLibro (@PathVariable int id , @RequestBody Libro libro ){
        return libroService.updateLibro(libro);

    }
    @DeleteMapping("{id}")
    public String eliminarLibro(@PathVariable int id){
        return libroService.deleteLibro(id);
    }
}
