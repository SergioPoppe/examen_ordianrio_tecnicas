

public class Documento {
        private String titulo;
        private String tipo; // Legal, financiero, operativo, etc.
        private String contenido;

        public Documento(String titulo, String tipo, String contenido) {
            this.titulo = titulo;
            this.tipo = tipo;
            this.contenido = contenido;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getTipo() {
            return tipo;
        }

        public String getContenido() {
            return contenido;
        }
}

