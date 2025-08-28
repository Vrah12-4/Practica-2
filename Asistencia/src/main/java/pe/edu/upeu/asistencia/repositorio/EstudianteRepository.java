package pe.edu.upeu.asistencia.repositorio;

import javafx.beans.property.BooleanPropertyBase;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import pe.edu.upeu.asistencia.modelo.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class EstudianteRepository {
    List<Estudiante> estudiantes=new ArrayList<>();

    List <Estudiante> findallEstudiantes () {
            estudiantes.add(new Estudiante(
                    new SimpleStringProperty("juan"),
                    new SimpleBooleanProperty(true)
                    )
            );
            return estudiantes;
    }
}

