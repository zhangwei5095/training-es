package io.training.repo;

import io.training.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by percy on 5/24/16.
 */
public interface UserRepo extends ElasticsearchRepository<User, Long> {

    public User findByName(String name);

}
