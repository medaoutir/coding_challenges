package dichotomicSearch;

import dichotomicSearch.DichotomicSearch;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DichotomicSearchTest {
    static DichotomicSearch dichotomicSearch;

    @BeforeAll
    static void setUp() {
        dichotomicSearch = new DichotomicSearch();
    }

    @Test
    void should_search_index_when_providing_sorted_table() {
        int [] tab = {1,3,5,9,10,15,20};
        assertEquals(5,dichotomicSearch.searchIndex(tab,15));
        assertEquals(1,dichotomicSearch.searchIndex(tab,3));
        assertEquals(0, dichotomicSearch.searchIndex(tab,1));
        assertEquals(-1,dichotomicSearch.searchIndex(tab,4));
    }
}