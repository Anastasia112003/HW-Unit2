import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class MainTests {
    Main sut;

    @Test
    public void testNewStrings() {
        //arrange
        String expected = "АННА, АНДРЕЙ, АЛЕКСАНДР, ПЁТР";
        //act
        var result = sut.newStrings();
        //assert
        assertThat(result, Matchers.equalTo(expected));

    }

    @Test
    public void testIsTrue() {
        //arrange
        boolean expected = false;
        // act
        var result = sut.isTrue();
        //assert
        assertThat(false, Matchers.equalTo(expected));
    }

    @Test
    public void testNewStringArray() {
        //arrange
        List<String> expected = Arrays.asList("Анастасия Дмитриевна", "Пётр Олегович", "Юлия Петровна", "Иванов Иван");
        //act
        var result = sut.newStringArray();
        //assert
        assertThat(expected, Matchers.equalTo(result));
    }

    @Test
    public void testHowMany() {
        //arrange
        int expected = 50150;
        //act
        var result = sut.howMany();
        //assert
        assertThat(expected, Matchers.equalTo(result));
    }

    @Test
    public void testHowManyDouble() {
        //arrange
        double expected = 3.75;
        //act
        var result = sut.howManyDouble();
        //assert
        assertThat(expected, Matchers.equalTo(result));
    }

}