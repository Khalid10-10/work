package lesson7.shop;

public class User {
    private String userName;
    private int level;
    private String pathToImage;

    public User() {
    }

    public User(String userName, int level, String pathToImage) {
        this.userName = userName;
        this.level = level;
        this.pathToImage = pathToImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }
}
