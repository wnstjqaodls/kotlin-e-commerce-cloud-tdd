import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class MyTest {
    @Test
    fun `증감 후위 연산자는 계산 이전 값을 반환한다` () {

        // given
        var a: Int = 3

        // when
        var actual = a++

        //then
        assertThat(actual).isEqualTo(3)
    }
}