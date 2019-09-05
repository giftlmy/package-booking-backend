package tws.entity;

public class Packages {
    private String numid;
    private String username;
    private String tel;
    private String state;
    private String time;
    private String weight;

    public String getNumid() {
        return numid;
    }

    public void setNumid(String numid) {
        this.numid = numid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Packages{" +
                "numid='" + numid + '\'' +
                ", username='" + username + '\'' +
                ", tel='" + tel + '\'' +
                ", state='" + state + '\'' +
                ", time='" + time + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public Packages() {
    }

    public Packages(String numid, String username, String tel, String state, String time, String weight) {
        this.numid = numid;
        this.username = username;
        this.tel = tel;
        this.state = state;
        this.time = time;
        this.weight = weight;
    }
}
