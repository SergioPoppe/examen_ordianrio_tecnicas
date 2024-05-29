

class Proveedor {
        private String nombre;
        private String servicio;
        private String contacto;

        public Proveedor(String nombre, String servicio, String contacto) {
            this.nombre = nombre;
            this.servicio = servicio;
            this.contacto = contacto;
        }

        public String getNombre() {
            return nombre;
        }

        public String getServicio() {
            return servicio;
        }

        public String getContacto() {
            return contacto;
        }
}


