package org.example.hw_9.task_2;


import java.math.BigDecimal;
import java.util.Objects;

public class Receipt {
    private String message;
    private BigDecimal amount;

    public Receipt() {
    }

    public Receipt(String message, BigDecimal amount) {
        this.message = message;
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receipt receipt = (Receipt) o;
        return Objects.equals(message, receipt.message) && Objects.equals(amount, receipt.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, amount);
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "message='" + message + '\'' +
                ", amount=" + amount +
                '}';
    }
}
