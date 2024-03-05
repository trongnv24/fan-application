package TrainingjavaSpring.boot.fan.dto.response;

import TrainingjavaSpring.boot.fan.dto.request.FanRequest;

public class FanResponse extends FanRequest {
    private String id;

    public FanResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "FanResponse{" +
                "id='" + id + '\'' +
                ", name='" + getName() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", type='" + getType() + '\'' +
                ", wattage=" + getWattage() +
                ", color='" + getColor() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
