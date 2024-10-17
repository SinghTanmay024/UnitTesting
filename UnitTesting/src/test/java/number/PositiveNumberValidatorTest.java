package number;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class PositiveNumberValidatorTest {

    PositiveNumberValidator SUT;

    @Before
    public void setup(){
        SUT = new PositiveNumberValidator();
    }

    @Test
    public void test1(){
        boolean res = SUT.isPositive(-1);
        Assert.assertThat(res,is(false));
    }

    @Test
    public void test2(){
        boolean res = SUT.isPositive(0);
        Assert.assertThat(res,is(false));
    }
    @Test
    public void test3(){
        boolean res = SUT.isPositive(1);
        Assert.assertThat(res,is(true));
    }
}