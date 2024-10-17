package words;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class StringReverserTest {

    StringReverser SUT;

    @Before
    public void setup() throws Exception{
        SUT = new StringReverser();
    }

    @Test
    public void reverse_emptyString_emptyStringReturned() {
        String res = SUT.reverse("");
        assertThat(res, CoreMatchers.is(""));
    }

    @Test
    public void reverse_SingleChar_SameStringReturned(){
        String res = SUT.reverse("a");
        assertThat(res,CoreMatchers.is("a"));
    }

    @Test
    public void reverse_longString_reversedString_Returned() {
        String res = SUT.reverse("Tanmay");
        assertThat(res,CoreMatchers.is("yamnaT"));
    }
}