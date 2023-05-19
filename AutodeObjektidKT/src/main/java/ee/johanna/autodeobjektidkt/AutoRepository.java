package ee.johanna.autodeobjektidkt;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutoRepository extends JpaRepository<Auto,Long> {
    Auto findByMark(String mark);
    List<Auto> findByPikkusIsBetween(int alg, int lopp);
    List<Auto> findByMassIsBetween(int alg, int lopp);


    List<Auto> findAllByMark(String mark);
}
