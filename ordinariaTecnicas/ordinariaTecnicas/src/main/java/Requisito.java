

public class Requisito {
        private String descripcion;
        private boolean cumplido;

        public Requisito(String descripcion) {
            this.descripcion = descripcion;
            this.cumplido = false;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public boolean isCumplido() {
            return cumplido;
        }

        public void setCumplido(boolean cumplido) {
            this.cumplido = cumplido;
        }
}
