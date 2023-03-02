import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumSquareOrSubstractTest {
@Test
    void shouldReturnSum (){
    //given
    int i = 7;
    int j = 5;

    //when
    int actual = SumSquareOrSubstract.sumSquareOrSubstract(i, j);
    //then
    assertEquals(i + j, actual);

    }
    @Test
    void shouldReturnSquare (){
        //given
        int i = 3;
        int j = 5;
        //when
        int actual = SumSquareOrSubstract.sumSquareOrSubstract(i, j);
        //then
        assertEquals(i * j, actual);

    }

}
