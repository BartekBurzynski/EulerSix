package pl.javastart.eulersix.service;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;


public class EulerSixServiceTest {
    @Test
    public void forThree_shouldReturnTwentyTwo() {
        //given
        EulerSixService eulerSixService = new EulerSixService();
        int x = 3;
        //when
        int calc = eulerSixService.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(22));
    }

    @Test
    public void forOne_shouldReturnZero() {
        //given
        EulerSixService eulerSixService = new EulerSixService();
        int x = 1;
        //when
        int calc = eulerSixService.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(0));
    }

    @Test
    public void forTwo_shouldReturnFour() {
        //given
        EulerSixService eulerSixService = new EulerSixService();
        int x = 2;
        //when
        int calc = eulerSixService.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(4));
    }
}
