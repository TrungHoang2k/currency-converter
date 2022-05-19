package curency.converter;

public class Converter implements Cloneable {
    private Long usd;
    private Long rate;
    private Long result;

    public Converter() {
    }

    public Converter(Long usd, Long rate) {
        this.usd = usd;
        this.rate = rate;
    }

    public Converter(Long usd, Long rate, Long result) {
        this.usd = usd;
        this.rate = rate;
        this.result = result;
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

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }


    @Override
    public Converter clone() {
        Converter converter = new Converter();
        converter.setUsd(usd);
        converter.setRate(rate);
        return converter;
    }

    @Override
    public String toString() {
        return "Converter{" +
                "usd=" + usd +
                ", rate='" + rate +
                '}';
    }
}
