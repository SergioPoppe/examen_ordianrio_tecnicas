import java.util.HashMap;
import java.util.Map;

public abstract class GMimplementacion implements GlamourFinancial {
    private final HashMap<Object, Object> stockPrecios;
    // Variables de instancia para mantener la cotización de las acciones en diferentes mercados
        private double valorLibro;  // Valor en libros de la compañía
        private int totalAcciones;   // Número total de acciones emitidas

        // Constructor
        public GMimplementacion(double initialBookValue, int totalShares) {
            this.stockPrecios = new HashMap<>();
            this.valorLibro = initialBookValue;
            this.totalAcciones = totalShares;
        }

        @Override
        public double getStockprecio(String market) {
            return (double) stockPrecios.getOrDefault(market, 0.0);
        }

        @Override
        public void updateStockprecio(String market, double price) {
            stockPrecios.put(market, price);
        }

        @Override
        public double calcularValorMercado() {
            double totalPrice = 0.0;
            int marketCount = stockPrecios.size();

            for (Object precio : stockPrecios.values()) {
                totalPrice += (double) precio;
            }

            double averagePrice = (marketCount > 0) ? (totalPrice / marketCount) : 0.0;
            return averagePrice * totalAcciones;
        }

        @Override
        public double calcularPrecioValorLibro() {
            double valorMercado = calcularValorMercado();
            return (valorLibro > 0) ? (valorMercado / valorLibro) : 0.0;
        }

        // Métodos adicionales para gestionar libroValor y totalAcciones si es necesario
        public double getLibroValor() {
            return valorLibro;
        }

        public void setLibroValor(double bookValue) {
            this.valorLibro = bookValue;
        }

        public int getTotalShares() {
            return totalAcciones;
        }

        public void setTotalShares(int totalShares) {
            this.totalAcciones = totalShares;
        }
    }

