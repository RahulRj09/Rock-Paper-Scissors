package gametest;

import gamelogic.RockPaperScissors;
import org.junit.Test;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {
    @Test
    public void shouldTheGameResultDraw(){
        assertEquals("draw", RockPaperScissors.getGameResult("rock","rock"));
    }
    @Test
    public void shouldTheGameResultWin(){
        assertEquals("you win", RockPaperScissors.getGameResult("paper","rock"));
    }
    @Test
    public void shouldTheGameResultLost(){
        assertEquals("sorry you lost", RockPaperScissors.getGameResult("rock","paper"));
    }
}
