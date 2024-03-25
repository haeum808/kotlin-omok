import omok.model.board.Board
import omok.model.entity.Point
import omok.model.turn.BlackTurn
import omok.model.turn.WhiteTurn
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TurnTest {
    @Test
    fun `오목판에 흑이 돌을 둔 다음 백이 두어야 한다`() {
        val whiteTurn = WhiteTurn(Board())
        val actual = whiteTurn.placeStone(Point(1, 1)) {}
        assertThat(actual).isInstanceOf(BlackTurn::class.java)
    }

    @Test
    fun `오목판에 백이 돌을 둔 다음 흑이 두어야 한다`() {
        val blackTurn = BlackTurn(Board())
        val actual = blackTurn.placeStone(Point(9, 9)) {}
        assertThat(actual).isInstanceOf(WhiteTurn::class.java)
    }
}
