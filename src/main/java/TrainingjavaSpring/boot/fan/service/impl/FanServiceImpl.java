package TrainingjavaSpring.boot.fan.service.impl;

import TrainingjavaSpring.boot.fan.dto.request.FanRequest;
import TrainingjavaSpring.boot.fan.dto.response.FanResponse;
import TrainingjavaSpring.boot.fan.entity.FanEntity;
import TrainingjavaSpring.boot.fan.repository.FanRepository;
import TrainingjavaSpring.boot.fan.service.FanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static TrainingjavaSpring.boot.fan.service.mapping.FanMappingService.convertDtoToEntity;
import static TrainingjavaSpring.boot.fan.service.mapping.FanMappingService.convertEntityToFanResponse;

@Service
@Slf4j
public class FanServiceImpl implements FanService {
    private final FanRepository fanRepository;

    public FanServiceImpl(FanRepository fanRepository) {
        this.fanRepository = fanRepository;
    }

    @Override
    public FanResponse create(FanRequest request) {
        log.info(" === Start api create new fan === ");
        log.info(" === Request Body : {} === ", request);
        FanEntity entity = convertDtoToEntity(request);
        entity = fanRepository.save(entity);
        FanResponse response = convertEntityToFanResponse(entity);
        log.info(" === Finish api create new fan, Fan Id : {} === ", response.getId());
        return response;
    }
}
