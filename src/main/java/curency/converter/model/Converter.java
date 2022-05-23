package curency.converter.model;

public class Converter implements Cloneable {
    private Long usd;
    private Long rate;

    public Converter() {
    }

    public Converter(Long usd, Long rate) {
        this.usd = usd;
        this.rate = rate;
    }

    public Long getUsd() {
        return usd;
    }

    public void setUsd(Long usd) {
        this.usd = usd;
    }

    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }

}
