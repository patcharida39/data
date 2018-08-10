package ArrayCollectionTest;

import csku.data.ArrayCollection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by 708 on 8/10/2018.
 */
public class ArrayCollectionTest {

    @Test
    public void testSize(){
        ArrayCollection arrayC = new ArrayCollection();
        assertEquals(0,arrayC.size());
    }
}
