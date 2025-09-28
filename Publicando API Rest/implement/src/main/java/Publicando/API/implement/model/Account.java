package Publicando.API.implement.model;

import java.math.BigDecimal;

public class Account {

    private Long id;
    private Long agency;
    private Long number;
    private BigDecimal limit;
    private BigDecimal balance;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getAgency() {
        return agency;
    }
    public void setAgency(Long agency) {
        this.agency = agency;
    }
    public Long getNumber() {
        return number;
    }
    public void setNumber(Long number) {
        this.number = number;
    }
    public BigDecimal getLimit() {
        return limit;
    }
    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
    public BigDecimal getBalance() {
        return balance;
    }
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

}
