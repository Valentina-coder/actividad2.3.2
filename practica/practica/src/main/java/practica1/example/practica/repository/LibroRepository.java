package practica1.example.practica.repository;


import org.springframework.stereotype.Repository;
import practica1.example.practica.model.Libro;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {
    private List<Libro> listaLibros = new ArrayList<>();


    public List<Libro> obtenerLibros(){
        return listaLibros;
    }

    public Libro buscarPorId (int id){
        for (Libro libro : listaLibros){
            if (libro.getId()== id){
                return libro;
            }
        }
        return null;
    }

    public Libro buscarPorIsbn(String isbn){
        for (Libro libro : listaLibros){
            if (libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }

    public Libro guardar(Libro lib){
        listaLibros.add(lib);
        return lib;

    }
    public Libro actualizar (Libro lib){
        int id =0;
        int idPosicion=0;

        for (int i =0; i < listaLibros.size();i++){
            if(listaLibros.get(i).getId()==lib.getId()){
                id= lib.getId();
                idPosicion =i;
            }
        }

    }

}
