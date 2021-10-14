package by.epam.task02.filler;

import by.epam.task02.entity.Pyramid;
import by.epam.task02.repository.PyramidRepository;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class RepositoryFiller {
    private static final Logger logger = LogManager.getLogger();


    public  void putRepository(List<Pyramid> pyramids){
        PyramidRepository repository = new PyramidRepository().getInstance();
        for (Pyramid pyramid: pyramids) {
            repository.add(pyramid);
        }
        logger.log(Level.INFO, " Repository  fill  successfully  {}", pyramids);
    }
    public void  putRepository( Pyramid ... pyramids){
        putRepository(Arrays.asList(pyramids));
    }

}
