import java.util.Objects;

public class MobilePhone {
    private String model;
    private String storage;
    private String weight;
    private String camera;

    public MobilePhone() {}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String toString() {
        return "MobilePhone{" +
                "model='" + model + '\'' +
                ", storage='" + storage + '\'' +
                ", weight='" + weight + '\'' +
                ", camera='" + camera + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilePhone that = (MobilePhone) o;
        return Objects.equals(storage, that.storage)
                && Objects.equals(camera, that.camera);
    }

}
