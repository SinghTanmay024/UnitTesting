package words;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringDuplicatorTest {

    StringDuplicator SUT;

    @Before
    public void setup() throws Exception{
        SUT = new StringDuplicator();
    }

    @Test
    public void duplicate_emptyString_emptyStringReturned() {
        String res = SUT.duplicate("");
        assertThat(res, CoreMatchers.is(""));
    }

    @Test
    public void duplicate_SingleChar_SameStringReturned(){
        String res = SUT.duplicate("a");
        assertThat(res,CoreMatchers.is("aa"));
    }

    @Test
    public void duplicate_longString_reversedString_Returned() {
        String res = SUT.duplicate("Tanmay");
        assertThat(res,CoreMatchers.is("TanmayTanmay"));
    }
}