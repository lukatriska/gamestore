import org.junit.Test;

import static org.junit.Assert.*;

public class GenreTest
{
    @Test
    public void toStringTest() throws Exception
    {

        assertEquals("action", Genre.ACTION.toString());
        assertEquals("mmorpg", Genre.MMORPG.toString());
        assertEquals("simulator", Genre.SIMULATOR.toString());
        assertEquals("historical", Genre.HISTORICAL.toString());

    }

}