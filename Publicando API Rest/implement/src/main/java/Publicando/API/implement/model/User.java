package Publicando.API.implement.model;

import java.util.List;

public class User {

    private String nome;
    private Account account;
    private Card card;
    private List<Feature> feature;
    private List<News> news;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
    public List<Feature> getFeature() {
        return feature;
    }
    public void setFeature(List<Feature> feature) {
        this.feature = feature;
    }
    public List<News> getNews() {
        return news;
    }
    public void setNews(List<News> news) {
        this.news = news;
    }

}
