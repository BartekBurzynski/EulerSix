package pl.javastart.eulersix.service;


import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;



public class EulerSixServiceTest {
    @Test
    public void shouldReturnFor3() {
        //given
        EulerSixService eulerSixService = new EulerSixService();
        int x = 3;
        //when
        int calc = eulerSixService.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(22));
    }
    @Test
    public void shouldReturnFor1() {
        //given
        EulerSixService eulerSixService = new EulerSixService();
        int x = 1;
        //when
        int calc = eulerSixService.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(0));
    }
    @Test
    public void shouldReturnFor2() {
        //given
        EulerSixService eulerSixService = new EulerSixService();
        int x = 2;
        //when
        int calc = eulerSixService.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(4));
    }
}
