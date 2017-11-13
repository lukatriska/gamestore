public enum Platform {
    WINDOWS("windows"), UBUNTU("ubuntu"), MACOS("macos"), IOS("ios"), ANDROID("android");

    private String name;

    Platform(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}