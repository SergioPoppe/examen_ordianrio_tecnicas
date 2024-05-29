import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Asignatura {

    // Clase Asignatura que modela una asignatura
        private String nombre;
        private String descripcion;

        public Asignatura(String nombre, String descripcion) {
            this.nombre = nombre;
            this.descripcion = descripcion;
        }

        public String getNombre() {
            return nombre;
        }

        public String getDescripcion() {
            return descripcion;
        }
}

