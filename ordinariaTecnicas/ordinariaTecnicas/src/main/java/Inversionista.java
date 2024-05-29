

public class Inversionista {
        private String nombre;
        private String tipo; // Individual, institucional, etc.
        private String contacto;

        public Inversionista(String nombre, String tipo, String contacto) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.contacto = contacto;
        }

        public String getNombre() {
            return nombre;
        }

        public String getTipo() {
            return tipo;
        }

        public String getContacto() {
            return contacto;
        }
}


