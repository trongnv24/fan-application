package TrainingjavaSpring.boot.fan.controller;

import TrainingjavaSpring.boot.fan.dto.request.FanRequest;
import TrainingjavaSpring.boot.fan.dto.response.FanResponse;
import TrainingjavaSpring.boot.fan.exeption.NotFoundException;
import TrainingjavaSpring.boot.fan.service.FanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fans")
@Slf4j
public class FanController {
    private final FanService service;

    public FanController(FanService service) {
        this.service = service;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FanResponse create(@RequestBody FanRequest request){
        log.info(" === Start api create new fan === ");
        log.info(" === Request Body : {} === ", request);
        FanResponse response = service.create(request);
        log.info(" === Finish api create new fan, Fan Id : {} === ", response.getId());
        return response;
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> getById(@PathVariable ("id") String id){
        log.info(" === Start api getById fan  === ");
        log.info(" === String id : {} === ", id);
        FanResponse response = service.getById(id);
        log.info(" === Finish api getById fan, Fan Id : {} ====", response.getId());
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public FanResponse update(@RequestBody FanRequest request, @PathVariable("id") String id){
        log.info(" === Start api update fan === ");
        log.info(" === Request Body : {}, String id : {} ", request, id);
        FanResponse response = service.update(request, id);
        log.info(" === Finish api update fan, Fan Id : {} === ", response.getId());
        return response;
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable ("id") String id){
        log.info(" === Start api deleteById fan === ");
        log.info(" === String id : {} === ", id);
        log.info(" Finish api deleteById fan, Fan id : {} === ");
        service.deleteById(id);
    }
}
