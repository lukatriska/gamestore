import java.util.ArrayList;

public class ComputerGameParameters
{

    private String name;
    private int ageRestriction;
    private ArrayList<Genre> genres;
    private ArrayList<Platform> platforms;
    private String description;

    public ComputerGameParameters(String name, int ageRestriction, ArrayList<Genre> genres,
                                  ArrayList<Platform> platforms, String description)
    {
        this.name = name;
        this.ageRestriction = ageRestriction;
        this.genres = genres;
        this.platforms = platforms;
        this.description = description;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAgeRestriction()
    {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction)
    {
        this.ageRestriction = ageRestriction;
    }

    public ArrayList<Genre> getGenres()
    {
        return genres;
    }

    public void addGenres(Genre genrre)
    {
        this.genres.add(genrre);
    }

    public ArrayList<Platform> getPlatforms()
    {
        return platforms;
    }

    public void addPlatforms(Platform platform)
    {
        this.platforms.add(platform);
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}