package pe.edu.upeu.encapsulamiento;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
//@Getter
//@Setter
public class Trabajador {
    private String nombre;
    private String apellido;
    private int edad;
    private String area;
    private char genero;

    @Override
    public String toString(){
        return "tiene las siguientes caracteristicas:\n"+
                "nombre:"+nombre+"\n"+
                "apellido:"+apellido+"\n"
                ;

    }


}