package tema8_ex1;

import java.util.HashMap;

public class StockTracker {
    public static void main(String[] args) {

        HashMap<String, Double> stocks = new HashMap<>();

        stocks.put("AAPL", 189.45);
        stocks.put("GOOG", 2750.30);
        stocks.put("TSLA", 720.10);
        stocks.put("AMZN", 3342.88);
        stocks.put("MSFT", 299.72);

        stocks.put("AAPL", 195.60);

        if (stocks.containsKey("TSLA")) {
            System.out.println("TSLA există în colecție.");
        } else {
            System.out.println("TSLA nu există.");
        }

        System.out.println("Tickere disponibile:");

        for (String ticker : stocks.keySet()) {
            System.out.println(ticker);
        }

        System.out.println(stocks);
    }
}

