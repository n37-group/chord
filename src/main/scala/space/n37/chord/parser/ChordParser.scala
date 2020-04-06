package space.n37.chord.parser

import space.n37.chord.term.TList

trait ChordParser {
  def parse(chord: String): TList
}
