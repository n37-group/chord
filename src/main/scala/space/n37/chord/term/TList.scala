package space.n37.chord.term

class TList(terms:List[Term]) extends Term {
  def apply(n:Int) : Term = terms(n)
}
