package largestRectangle;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestRectangleTest {
    static LargestRectangle largestRectangle;

    @BeforeAll
    static void setUp(){
        largestRectangle = new LargestRectangle();
    }

    @Test
    void largestRectangleArea() {
        assertEquals(10, largestRectangle.largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }
}