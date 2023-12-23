import org.example.Task1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    private Task1 handler;

    @BeforeEach
    void setUp() {
        handler = new Task1();
    }

    @Test
    void testRequestGeneration() {
        handler.generateRequest();
        assertEquals(1, handler.getQueueSize());
    }

    @Test
    void testRequestProcessing() {
        handler.generateRequest();
        handler.processRequest();
        assertEquals(0, handler.getQueueSize());
    }

    @Test
    void testEmptyQueueProcessing() {
        handler.processRequest();
        assertEquals(0, handler.getQueueSize());
    }
}
