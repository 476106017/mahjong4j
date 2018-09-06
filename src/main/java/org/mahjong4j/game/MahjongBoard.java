package org.mahjong4j.game;

import org.mahjong4j.*;
import org.mahjong4j.hands.Hands;
import org.mahjong4j.tile.Tile;

import java.util.*;

import static org.mahjong4j.tile.Tile.SHA;

/**
 * @author yu1ro
 */
public class MahjongBoard {
    private List<Tile> yama;
    private List<Tile> dora;
    private List<Tile> uradora;
    private GeneralSituation generalSituation;
    private int turn;

    private Gamer[] gamers;

    public MahjongBoard() {
        yama = new LinkedList<>();
        for (int i = 0; i < 4; i++)
            yama.addAll(Arrays.asList(Tile.values()));
        Collections.shuffle(yama);
        dora = new ArrayList<>(5);
        dora.add(draw());
        uradora = new ArrayList<>(5);
        uradora.add(draw());
        generalSituation = new GeneralSituation(true, false, Tile.TON, dora,uradora);

        for (int i = 0; i < gamers.length; i++) {
            PersonalSituation personalSituation =
                new PersonalSituation(false, false, false, false, false, false, Tile.valueOf(27+i));
            gamers[i] = new Gamer(drawHands(), generalSituation, personalSituation);
        }

        turn = 0;
    }

    public void nextTurn(){
        turn = (turn+1)%4;
    }

    private Tile draw(){
        return yama.remove(0);
    }
    private int[] drawHands() {
        int[] handsComp = new int[34];
        for (int i = 0; i < 13; i++) {
            handsComp[draw().getCode()]++;
        }
        return handsComp;
    }
}
