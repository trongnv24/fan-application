package TrainingjavaSpring.boot.fan.service;

import TrainingjavaSpring.boot.fan.dto.request.FanRequest;
import TrainingjavaSpring.boot.fan.dto.response.FanResponse;

public interface FanService {

    FanResponse create (FanRequest request);

    FanResponse getById(String id);

    FanResponse update(FanRequest request , String id);

    void deleteById(String id);
}
