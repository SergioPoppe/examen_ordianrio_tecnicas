public class main {
        public static void main(String[] args) {
            // Crear instancias de asignaturas
            Asignatura asignatura1 = new Asignatura("Contabilidad", "Fundamentos de contabilidad");
            Asignatura asignatura2 = new Asignatura("Finanzas", "Principios de finanzas");

            // Crear un curso y agregar asignaturas
            Curso cursoIPO = new Curso("Preparación para IPO");
            cursoIPO.agregarAsignatura(asignatura1);
            cursoIPO.agregarAsignatura(asignatura2);

            // Crear un empleado y registrar asignaturas y notas
            Empleado empleado1 = new Empleado("E001", "Juan Pérez");
            empleado1.getRegistroAcademico().inscribirAsignatura(asignatura1);
            empleado1.getRegistroAcademico().inscribirAsignatura(asignatura2);
            empleado1.getRegistroAcademico().registrarNota(asignatura1, 85);
            empleado1.getRegistroAcademico().registrarNota(asignatura2, 90);

            // Calcular y mostrar el promedio académico del empleado
            double promedio = empleado1.getRegistroAcademico().calcularPromedio();
            System.out.println("Promedio académico de " + empleado1.getNombre() + ": " + promedio);

            // Emitir certificado
            empleado1.getRegistroAcademico().emitirCertificado(cursoIPO.getNombreCurso());
            System.out.println("Certificados de " + empleado1.getNombre() + ": " + empleado1.getRegistroAcademico().getCertificados());

            // Crear instancias de documentos, requisitos, hitos, proveedores e inversionistas
            Documento documento1 = new Documento("Prospecto IPO", "Legal", "Contenido del prospecto");
            Requisito requisito1 = new Requisito("Aprobación del consejo");
            Hito hito1 = new Hito("Registro en la SEC", "2024-06-01");
            Proveedor proveedor1 = new Proveedor("Consultora XYZ", "Asesoría legal", "contacto@xyz.com");
            Inversionista inversionista1 = new Inversionista("Inversionista A", "Institucional", "contacto@inversionistaA.com");

            // Crear instancia de gestión de IPO y agregar elementos
            GestionIPO gestionIPO = new GestionIPO();
            gestionIPO.agregarDocumento(documento1);
            gestionIPO.agregarRequisito(requisito1);
            gestionIPO.agregarHito(hito1);
            gestionIPO.agregarProveedor(proveedor1);
            gestionIPO.agregarInversionista(inversionista1);

            // Actualizar estados y seguir progreso
            gestionIPO.actualizarEstadoRequisito("Aprobación del consejo", true);
            gestionIPO.actualizarEstadoHito("Registro en la SEC", true);

            // Seguir y mostrar el progreso del proceso de IPO
            gestionIPO.seguirProgreso();
        }
}

