package ee.johanna.autodeobjektidkt;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OmanikRepository extends JpaRepository<Omanik,String> {
    Omanik findByNimi(String nimi);

}
