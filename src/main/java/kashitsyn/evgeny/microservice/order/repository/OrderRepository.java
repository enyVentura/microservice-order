package kashitsyn.evgeny.microservice.order.repository;

import kashitsyn.evgeny.microservice.order.domain.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
}
