//import ComputerGameParameters;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ComputerGameParametersTest
{

    private String name;
    private int ageRestriction;
    private ArrayList<Genre> genres = new ArrayList<Genre>();
    private ArrayList<Platform> platforms = new ArrayList<Platform>();
    private String description;
    private ComputerGameParameters CivilizationParameters;

    @Before
    public void initiate()
    {
        name = "Civilization";
        ageRestriction = 14;
        genres.add(Genre.HISTORICAL);
        platforms.add(Platform.WINDOWS);
        platforms.add(Platform.MACOS);
        description = "this is a strategy that makes you think better";
        CivilizationParameters = new ComputerGameParameters(name, ageRestriction, genres, platforms, description);
    }

//    ArrayList<Platform> CSGOPlatforms = new ArrayList<Platform>();
//    CSGOPlatforms.add(Platform.Linux);
//    CSGOPlatforms.add(Platform.Windows);
//    CSGOPlatforms.add(Platform.MAC);
//    ComputerGameParameters CSGOParameters = new ComputerGameParameters("CS:GO", "is a multiplayer first-person shooter video game developed by Hidden Path Entertainment and Valve Corporation.", 266.48,
//            17, CivilizationGenres, CSGOPlatforms, 1);



    @Test
    public void testGetName() throws Exception
    {
        assertEquals(name, CivilizationParameters.getName());
    }

    @Test
    public void testGetAgeRestriction() throws Exception
    {
        assertEquals(ageRestriction, CivilizationParameters.getAgeRestriction());
    }

    @Test
    public void testGetGenres() throws Exception
    {
        assertEquals(genres, CivilizationParameters.getGenres());
    }

    @Test
    public void testGetPlatforms() throws Exception
    {
        assertEquals(platforms, CivilizationParameters.getPlatforms());
    }

    @Test
    public void testGetDescription() throws Exception
    {
        assertEquals(description, CivilizationParameters.getDescription());
    }

    @Test
    public void testSetName() throws Exception
    {
        name = "Civilization 2";
        CivilizationParameters.setName(name);
        assertEquals(name, CivilizationParameters.getName());
    }

    @Test
    public void testSetAgeRestriction() throws Exception
    {
        ageRestriction = 20;
        CivilizationParameters.setAgeRestriction(ageRestriction);
        assertEquals(ageRestriction, CivilizationParameters.getAgeRestriction());
    }


    @Test
    public void testAddGenres() throws Exception
    {
        genres.add(Genre.SIMULATOR);
        CivilizationParameters.addGenres(Genre.SIMULATOR);
        assertEquals(genres, CivilizationParameters.getGenres());
    }


    @Test
    public void testAddPlatforms() throws Exception
    {
        platforms.add(Platform.ANDROID);
        CivilizationParameters.addPlatforms(Platform.ANDROID);
        assertEquals(platforms, CivilizationParameters.getPlatforms());
    }


    @Test
    public void testSetDescription() throws Exception
    {
        description = "different description";
        CivilizationParameters.setDescription("different description");
        assertEquals(description, CivilizationParameters.getDescription());
    }

}