public interface GlamourFinancial {
        // Métodos para obtener la cotización de las acciones en diferentes mercados
        double getStockPrecio(String market);

        // Métodos para actualizar la cotización de las acciones en diferentes mercados
        void updateStockPrecio(String market, double price);

        // Método para calcular el valor de mercado de la compañía
        double calculateValorMercado();

        // Método para calcular el precio-valor en libros
        double calculatePrecioValorLibro();

        double getStockprecio(String market);

        void updateStockprecio(String market, double price);

        double calcularValorMercado();

        double calcularPrecioValorLibro();
}


