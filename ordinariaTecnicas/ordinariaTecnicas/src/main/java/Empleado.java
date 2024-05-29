import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Empleado {
        private String idEmpleado;
        private String nombre;
        private RegistroAcademico registroAcademico;

        public Empleado(String idEmpleado, String nombre) {
            this.idEmpleado = idEmpleado;
            this.nombre = nombre;
            this.registroAcademico = new RegistroAcademico();
        }

        public String getIdEmpleado() {
            return idEmpleado;
        }

        public String getNombre() {
            return nombre;
        }

        public RegistroAcademico getRegistroAcademico() {
            return registroAcademico;
        }
}


