import static org.junit.jupiter.api.Assertions.*;

class CLLTest {

    @org.junit.jupiter.api.Test
    void addItem() {
        CLL<Integer> cll1 = new CLL<>();
        CLL<Integer> cll2 = new CLL<>();

        cll1.addItem(2);
        cll2.addItem(2);
        cll2.addItem(4);
        cll2.addItem(1);
        cll2.addItem(3);

        assertTrue(cll1.find(2));
        assertFalse(cll1.find(4));
        assertTrue(cll2.find(2));
        assertTrue(cll2.find(4));
        assertTrue(cll2.find(1));
        assertTrue(cll2.find(3));
    }

    @org.junit.jupiter.api.Test
    void showList() {
    }

    @org.junit.jupiter.api.Test
    void showReverseList() {
    }

    @org.junit.jupiter.api.Test
    void find() {
        CLL<Float> cll1 = new CLL<>();
        CLL<Float> cll2 = new CLL<>();

        cll1.addItem(2.0F);
        cll2.addItem(2.0F);
        cll2.addItem(-4.2F);
        cll2.addItem(1.3F);
        cll2.addItem(3.7F);

        assertTrue(cll1.find(2.0F));
        assertFalse(cll1.find(4.9F));
        assertTrue(cll2.find(2.0F));
        assertTrue(cll2.find(-4.2F));
        assertTrue(cll2.find(1.3F));
        assertTrue(cll2.find(3.7F));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        CLL<String> cll1 = new CLL<>();
        CLL<String> cll2 = new CLL<>();

        cll1.addItem("Word");
        cll2.addItem("More ");
        cll2.addItem("than ");
        cll2.addItem("one ");
        cll2.addItem("word.");

        cll2.remove("word.");

        assertTrue(cll1.find("Word"));
        assertTrue(cll1.find("WORD"));
        assertTrue(cll2.find("More "));
        assertTrue(cll2.find(" than "));
        assertTrue(cll2.find(" one"));
        assertFalse(cll2.find("word."));
    }
}