public enum Genre {
    ACTION("action"), MMORPG("mmorpg"), SIMULATOR("simulator"), HISTORICAL("historical");

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    private String name;

    Genre(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}