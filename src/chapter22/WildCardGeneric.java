package chapter22;

public class WildCardGeneric<W> {
    W wildCard;
    public void setWildCard(W wildCard) {
        this.wildCard = wildCard;
    }
    
    public W getWildCard() {
        return wildCard;
    }
}
