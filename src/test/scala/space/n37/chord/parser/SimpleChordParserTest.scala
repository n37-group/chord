package space.n37.chord.parser

import org.junit.jupiter.api.Test
import space.n37.chord.term.{Atom, Variable}


class SimpleChordParserTest {
    @Test
    def test()  {
        val parser = SimpleChordParser()

        val chord = parser.parse("XxyYzXx")

        val X = chord(0)
        val x = chord(1)
        val y = chord(2)
        val Y = chord(3)
        val z = chord(4)
        val X2 = chord(5)
        val x2 = chord(6)

        assert(X.isInstanceOf[Variable])
        assert(x.isInstanceOf[Atom])
        assert(y.isInstanceOf[Atom])
        assert(Y.isInstanceOf[Variable])
        assert(z.isInstanceOf[Atom])
        assert(X2.isInstanceOf[Variable])
        assert(x2.isInstanceOf[Atom])

        assert(X == X2)
        assert(x == x2)
    }
}