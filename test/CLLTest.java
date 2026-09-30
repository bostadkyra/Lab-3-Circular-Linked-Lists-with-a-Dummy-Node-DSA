import static org.junit.jupiter.api.Assertions.*;

class CLLTest {

    @org.junit.jupiter.api.Test
    void addItem() {
        CLL<Integer> cll1 = new CLL<>();
        cll1.addItem(2);

        assertTrue(cll1.find(2));
    }

    @org.junit.jupiter.api.Test
    void showList() {
    }

    @org.junit.jupiter.api.Test
    void showReverseList() {
    }

    @org.junit.jupiter.api.Test
    void find() {
    }

    @org.junit.jupiter.api.Test
    void remove() {
    }
}