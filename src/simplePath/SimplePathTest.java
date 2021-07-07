package simplePath;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplePathTest {
    static SimplePath simplePath;

    @BeforeAll
    static void setUp(){
        simplePath = new SimplePath();
    }

    @Test
    void simplifyPath() {
        assertEquals("/home",simplePath.simplifyPath("/home/"));
        assertEquals("/home/foo",simplePath.simplifyPath("/home//foo/"));
        assertEquals("/c",simplePath.simplifyPath("/a/./b/../../c/"));
        assertEquals("/",simplePath.simplifyPath("/../"));
        }
}