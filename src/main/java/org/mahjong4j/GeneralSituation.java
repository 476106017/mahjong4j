package org.mahjong4j;

import org.mahjong4j.tile.Tile;

import java.util.List;

/**
 * @author yu1ro
 */
public class GeneralSituation {
    private boolean isFirstRound;
    private boolean isLastRound;
    private Tile bakaze;
    private List<Tile> dora;
    private List<Tile> uradora;

    public GeneralSituation(boolean isFirstRound, boolean isLastRound, Tile bakaze, List<Tile> dora, List<Tile> uradora) {
        this.isFirstRound = isFirstRound;
        this.isLastRound = isLastRound;
        this.bakaze = bakaze;
        this.dora = dora;
        this.uradora = uradora;
    }

    public GeneralSituation() {
    }

    public boolean isFirstRound() {

        return isFirstRound;
    }

    public void setFirstRound(boolean firstRound) {
        isFirstRound = firstRound;
    }

    public boolean isLastRound() {
        return isLastRound;
    }

    public void setLastRound(boolean LastRound) {
        isLastRound = LastRound;
    }

    public Tile getBakaze() {
        return bakaze;
    }

    public void setBakaze(Tile bakaze) {
        this.bakaze = bakaze;
    }

    public List<Tile> getDora() {
        return dora;
    }

    public void setDora(List<Tile> dora) {
        this.dora = dora;
    }

    public List<Tile> getUradora() {
        return uradora;
    }

    public void setUradora(List<Tile> uradora) {
        this.uradora = uradora;
    }
}
