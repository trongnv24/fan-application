package TrainingjavaSpring.boot.fan.dto.request;

public class FanRequest {
    private String name;
    private String manufacturer;
    private String type;
    private float wattage;
    private String color;
    private float price;

    public FanRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getWattage() {
        return wattage;
    }

    public void setWattage(float wattage) {
        this.wattage = wattage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FanRequest{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", wattage=" + wattage +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
