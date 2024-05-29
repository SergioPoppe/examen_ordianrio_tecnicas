import java.util.ArrayList;
import java.util.List;

public class Curso {
        private String nombreCurso;
        private List<Asignatura> asignaturas;

        public Curso(String nombreCurso) {
            this.nombreCurso = nombreCurso;
            this.asignaturas = new ArrayList<>();
        }

        public String getNombreCurso() {
            return nombreCurso;
        }

        public void agregarAsignatura(Asignatura asignatura) {
            asignaturas.add(asignatura);
        }

        public List<Asignatura> getAsignaturas() {
            return asignaturas;
        }
}

