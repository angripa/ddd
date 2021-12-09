package ddd.sample.infrastructure.repository;

import ddd.sample.domain.model.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface CommonRepository<T extends BaseEntity> {
   Page<T> findByIdAndDeletedIsFalse(Long id, Pageable pageable);

   Optional<T> findByIdAndDeletedIsFalse(Long id);

   Page<T> findAllByDeletedIsFalse(Pageable pageable);

   Optional<List<T>> findByDeletedIsFalse();

   Optional<List<T>> findByDeletedIsFalse(Pageable pageable);
}
