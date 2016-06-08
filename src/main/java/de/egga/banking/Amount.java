package de.egga.banking;

public class Amount {

    private final int amount;

    public Amount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Amount amount1 = (Amount) o;
        return amount == amount1.amount;
    }

    @Override
    public int hashCode() {
        return amount;
    }

    public Amount add(Amount amount) {
        return new Amount(this.amount + amount.amount);
    }

    public String print() {
        return amount + "";
    }
}
