
public class Hito {

        private String descripcion;
        private String fecha;
        private boolean completado;

        public Hito(String descripcion, String fecha) {
            this.descripcion = descripcion;
            this.fecha = fecha;
            this.completado = false;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public String getFecha() {
            return fecha;
        }

        public boolean isCompletado() {
            return completado;
        }

        public void setCompletado(boolean completado) {
            this.completado = completado;
        }
}

