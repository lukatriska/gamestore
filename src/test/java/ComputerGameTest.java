import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ComputerGameTest
{
    private float price;
    private ComputerGameParameters parameters;
    private int inStock;
    private ArrayList<Genre> genres = new ArrayList<Genre>();
    private ArrayList<Platform> platforms = new ArrayList<Platform>();
    private String description;
    ComputerGame game;

    @Before
    public void initiate()
    {
        genres.add(Genre.HISTORICAL);
        price = 30F;
        inStock = 6;
        platforms.add(Platform.WINDOWS);
        platforms.add(Platform.MACOS);
        description = "this is a strategy that makes you think better";
        parameters = new ComputerGameParameters("Civilization", 14, genres, platforms, description);
        game = new ComputerGame(30F, 6, parameters);
    }


    @Test
    public void testGetPrice() throws Exception
    {
        assertEquals(price, game.getPrice(), 0.001);
    }

    @Test
    public void testSetPrice() throws Exception
    {
        float newPrice = 40F;
        price = newPrice;
        game.setPrice(newPrice);
        assertEquals(newPrice, game.getPrice(), 0.001);
    }

    @Test
    public void testGetParameters() throws Exception
    {
        assertEquals(parameters, game.getParameters());
    }

    @Test
    public void testSetParameters() throws Exception
    {
        genres.add(Genre.SIMULATOR);
        price = 50F;
        inStock = 44;
        platforms.add(Platform.IOS);
        description = "some other description";
        ComputerGameParameters newParameters = new ComputerGameParameters("Civilization", 14, genres, platforms, description);
        game.setParameters(newParameters);
        assertEquals(newParameters.getAgeRestriction(), game.getParameters().getAgeRestriction());
        assertEquals(newParameters.getDescription(), game.getParameters().getDescription());
        assertEquals(newParameters.getGenres(), game.getParameters().getGenres());
        assertEquals(newParameters.getName(), game.getParameters().getName());
        assertEquals(newParameters.getPlatforms(), game.getParameters().getPlatforms());
    }

}