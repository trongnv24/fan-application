package TrainingjavaSpring.boot.fan.service;

import TrainingjavaSpring.boot.fan.dto.request.FanRequest;
import TrainingjavaSpring.boot.fan.dto.response.FanResponse;

public interface FanService {

    FanResponse create (FanRequest request);
}
