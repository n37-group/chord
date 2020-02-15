package space.n37.chord.term

object Atom {
  val atoms = collection.mutable.Map[Char, Atom]()

  def apply(name: Char) = {
    atoms.getOrElseUpdate(name, new Atom(name))
  }
}

class Atom(name: Char) extends Term {

}
