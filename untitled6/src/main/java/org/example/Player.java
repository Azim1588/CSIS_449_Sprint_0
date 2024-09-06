
package org.example;

public class Player {
    private String name;
    private String symbol;
    private boolean isComputer;

    public Player(String name, String symbol, boolean isComputer) {
        this.name = name;
        this.symbol = symbol;
        this.isComputer = isComputer;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean isComputer() {
        return isComputer;
    }
}
