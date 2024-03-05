package TrainingjavaSpring.boot.fan.repository;

import TrainingjavaSpring.boot.fan.entity.FanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FanRepository extends JpaRepository<FanEntity, String> {
}
