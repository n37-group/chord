package space.n37.chord.term;

import org.junit.jupiter.api.Test;

class EnvironmentTest {

    @Test
    def atoms(): Unit = {
        val env1:Environment = new Environment
        val env2:Environment = new Environment

        val a1 = env1.atom('a')
        val b1 = env1.atom('b')
        val a1_2 = env1.atom('a')

        val a2 = env2.atom('a')
        val b2 = env2.atom('b')

        assert(a1 == a2)
        assert(a1 == a1_2)
        assert(a1 != b2)
    }

    @Test
    def variables(): Unit = {
        val env1:Environment = new Environment
        val env2:Environment = new Environment

        val a1 = env1.variable("X")
        val b1 = env1.variable("Y")
        val a1_2 = env1.variable("X")


    }
}