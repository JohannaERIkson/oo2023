package ee.johanna.autodeobjektidkt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class OmanikController {

    @Autowired
    OmanikRepository omanikRepository;

    @Autowired
    AutoRepository autoRepository;

    @GetMapping("lisa-omanikule-auto")
    public String lisaOmanikuleAuto(
            @RequestParam String nimi,
            @RequestParam Long id
    ){
        Omanik omanik = omanikRepository.findByNimi(nimi);
        Auto auto = autoRepository.findById(id).get();
        List<Auto> omanikuAutod=omanik.getAutod();
        omanikuAutod.add(auto);
        omanik.setAutod(omanikuAutod);
        omanikRepository.save(omanik);
        return "Auto omanikule lisatud!";
    }

    @GetMapping("lisa-omanik")
    public List<Omanik> lisaOmanik(
            @RequestParam  String nimi
    ){
        omanikRepository.save(new Omanik(nimi, new ArrayList<>()));
        return omanikRepository.findAll();
    }

    //localhost:8080/saa-autod?nimi=Jaanika
    @GetMapping("saa-autod")
   public List<Auto> saaAutod(
        @RequestParam String nimi
    ){
        return omanikRepository.findByNimi(nimi).getAutod();

   }

}
