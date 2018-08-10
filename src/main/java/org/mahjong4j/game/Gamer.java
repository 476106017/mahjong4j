package org.mahjong4j.game;

import org.mahjong4j.GeneralSituation;
import org.mahjong4j.PersonalSituation;
import org.mahjong4j.Player;

public class Gamer {
    private int[] hands;
    private GeneralSituation generalSituation;
    private PersonalSituation personalSituation;

    public Gamer(int[] hands, GeneralSituation generalSituation, PersonalSituation personalSituation) {
        this.hands = hands;
        this.generalSituation = generalSituation;
        this.personalSituation = personalSituation;
    }

    public int[] getHands() {
        return hands;
    }

    public void setHands(int[] hands) {
        this.hands = hands;
    }

    public GeneralSituation getGeneralSituation() {
        return generalSituation;
    }

    public void setGeneralSituation(GeneralSituation generalSituation) {
        this.generalSituation = generalSituation;
    }

    public PersonalSituation getPersonalSituation() {
        return personalSituation;
    }

    public void setPersonalSituation(PersonalSituation personalSituation) {
        this.personalSituation = personalSituation;
    }


}
