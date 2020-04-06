package space.n37.chord.parser

import space.n37.chord.term.{Atom, Environment, TList, Term, Variable}

object SimpleChordParser  {
  def fromChar(env: Environment, c: Char): Term = {
    if (c.isUpper)
      env.variable(c.toString)
    else
      env.atom(c)
  }

  def apply(): SimpleChordParser = new SimpleChordParser(new Environment)
}

class SimpleChordParser(env: Environment) extends ChordParser {
  def parse(chord: String): TList = {
    new TList(chord.map(c => SimpleChordParser.fromChar(env, c)).toList)
  }
}
