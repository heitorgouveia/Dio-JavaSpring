package Publicando.API.implement.model;

import java.math.BigDecimal;

public class Card {

    private Long id;
    private BigDecimal limit;
    private BigDecimal number;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public BigDecimal getLimit() {
        return limit;
    }
    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
    public BigDecimal getNumber() {
        return number;
    }
    public void setNumber(BigDecimal number) {
        this.number = number;
    }
    

}
