package space.n37.chord.term

class Environment {
  private val variables = collection.mutable.Map[String, Variable]()

  def variable(name: String) : Variable = {
    variables.getOrElseUpdate(name, new Variable(name))
  }

  def atom(name: Char) : Atom = {
    Atom(name)
  }
}
