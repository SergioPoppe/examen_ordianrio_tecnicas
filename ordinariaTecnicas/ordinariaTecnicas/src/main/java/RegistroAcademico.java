import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistroAcademico {
        private Map<Asignatura, Double> calificacionesAsignaturas;
        private List<String> certificados;

        public RegistroAcademico() {
            this.calificacionesAsignaturas = new HashMap<>();
            this.certificados = new ArrayList<>();
        }

        // Método para inscribir a un empleado en una asignatura
        public void inscribirAsignatura(Asignatura asignatura) {
            if (!calificacionesAsignaturas.containsKey(asignatura)) {
                calificacionesAsignaturas.put(asignatura, null); // null significa que no se ha asignado una nota todavía
            }
        }

        // Método para registrar una nota en una asignatura
        public void registrarNota(Asignatura asignatura, double nota) {
            if (calificacionesAsignaturas.containsKey(asignatura)) {
                calificacionesAsignaturas.put(asignatura, nota);
            }
        }

        // Método para calcular el promedio académico
        public double calcularPromedio() {
            double totalNotas = 0.0;
            int numeroAsignaturas = 0;

            for (Double nota : calificacionesAsignaturas.values()) {
                if (nota != null) {
                    totalNotas += nota;
                    numeroAsignaturas++;
                }
            }

            return (numeroAsignaturas > 0) ? (totalNotas / numeroAsignaturas) : 0.0;
        }

        // Método para emitir un certificado
        public void emitirCertificado(String nombreCurso) {
            certificados.add(nombreCurso);
        }

        public List<String> getCertificados() {
            return certificados;
        }
}

