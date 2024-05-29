import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionIPO {
        private List<Documento> documentos;
        private List<Requisito> requisitos;
        private List<Hito> hitos;
        private List<Proveedor> proveedores;
        private List<Inversionista> inversionistas;

        public GestionIPO() {
            this.documentos = new ArrayList<>();
            this.requisitos = new ArrayList<>();
            this.hitos = new ArrayList<>();
            this.proveedores = new ArrayList<>();
            this.inversionistas = new ArrayList<>();
        }

        // Métodos para gestionar documentos
        public void agregarDocumento(Documento documento) {
            documentos.add(documento);
        }

        public List<Documento> getDocumentos() {
            return documentos;
        }

        // Métodos para gestionar requisitos
        public void agregarRequisito(Requisito requisito) {
            requisitos.add(requisito);
        }

        public List<Requisito> getRequisitos() {
            return requisitos;
        }

        // Métodos para gestionar hitos
        public void agregarHito(Hito hito) {
            hitos.add(hito);
        }

        public List<Hito> getHitos() {
            return hitos;
        }

        // Métodos para gestionar proveedores
        public void agregarProveedor(Proveedor proveedor) {
            proveedores.add(proveedor);
        }

        public List<Proveedor> getProveedores() {
            return proveedores;
        }

        // Métodos para gestionar inversionistas
        public void agregarInversionista(Inversionista inversionista) {
            inversionistas.add(inversionista);
        }

        public List<Inversionista> getInversionistas() {
            return inversionistas;
        }

        // Método para actualizar el estado de un requisito
        public void actualizarEstadoRequisito(String descripcion, boolean cumplido) {
            for (Requisito requisito : requisitos) {
                if (requisito.getDescripcion().equals(descripcion)) {
                    requisito.setCumplido(cumplido);
                }
            }
        }

        // Método para actualizar el estado de un hito
        public void actualizarEstadoHito(String descripcion, boolean completado) {
            for (Hito hito : hitos) {
                if (hito.getDescripcion().equals(descripcion)) {
                    hito.setCompletado(completado);
                }
            }
        }

        // Método para seguir el progreso del proceso de IPO
        public void seguirProgreso() {
            System.out.println("Documentos:");
            for (Documento documento : documentos) {
                System.out.println("- " + documento.getTitulo() + " (" + documento.getTipo() + ")");
            }

            System.out.println("Requisitos:");
            for (Requisito requisito : requisitos) {
                System.out.println("- " + requisito.getDescripcion() + " (Cumplido: " + requisito.isCumplido() + ")");
            }

            System.out.println("Hitos:");
            for (Hito hito : hitos) {
                System.out.println("- " + hito.getDescripcion() + " (Completado: " + hito.isCompletado() + ")");
            }

            System.out.println("Proveedores:");
            for (Proveedor proveedor : proveedores) {
                System.out.println("- " + proveedor.getNombre() + " (Servicio: " + proveedor.getServicio() + ")");
            }

            System.out.println("Inversionistas:");
            for (Inversionista inversionista : inversionistas) {
                System.out.println("- " + inversionista.getNombre() + " (Tipo: " + inversionista.getTipo() + ")");
            }
        }
}

