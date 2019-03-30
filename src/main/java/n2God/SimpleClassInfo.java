package n2God;

public class SimpleClassInfo {

    int id;
    String info;

    public SimpleClassInfo(int id, String info) {
        this.id = id;
        this.info = info;
    }

    public SimpleClassInfo(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "SimpleClassInfo{" +
                "id=" + id +
                ", info='" + info + '\'' +
                '}';
    }
}
