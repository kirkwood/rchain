package rholang.parsing.delimc.Absyn; // Java Package generated by the BNF Converter.

public class TType3 extends TType {
  public final Type type_1, type_2, type_3;
  public TType3(Type p1, Type p2, Type p3) { type_1 = p1; type_2 = p2; type_3 = p3; }

  public <R,A> R accept(rholang.parsing.delimc.Absyn.TType.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.delimc.Absyn.TType3) {
      rholang.parsing.delimc.Absyn.TType3 x = (rholang.parsing.delimc.Absyn.TType3)o;
      return this.type_1.equals(x.type_1) && this.type_2.equals(x.type_2) && this.type_3.equals(x.type_3);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.type_1.hashCode())+this.type_2.hashCode())+this.type_3.hashCode();
  }


}
