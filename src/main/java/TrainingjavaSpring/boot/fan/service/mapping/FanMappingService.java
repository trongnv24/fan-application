package TrainingjavaSpring.boot.fan.service.mapping;

import TrainingjavaSpring.boot.fan.dto.request.FanRequest;
import TrainingjavaSpring.boot.fan.dto.response.FanResponse;
import TrainingjavaSpring.boot.fan.entity.FanEntity;

public class FanMappingService {

    public static FanEntity convertDtoToEntity (FanRequest dto){
        FanEntity fanEntity = new FanEntity();
        fanEntity.setName(dto.getName());
        fanEntity.setType(dto.getType());
        fanEntity.setWattage(dto.getWattage());
        fanEntity.setColor(dto.getColor());
        fanEntity.setPrice(dto.getPrice());
        return fanEntity;
    }
    public static FanResponse convertEntityToFanResponse(FanEntity entity){
        FanResponse dto = new FanResponse();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setType(entity.getType());
        dto.setWattage(entity.getWattage());
        dto.setColor(entity.getColor());
        dto.setPrice(entity.getPrice());
        return dto;
    }
}
