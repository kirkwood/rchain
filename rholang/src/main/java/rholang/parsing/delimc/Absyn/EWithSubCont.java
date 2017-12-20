package rholang.parsing.delimc.Absyn; // Java Package generated by the BNF Converter.

public class EWithSubCont extends Expr {
  public final TypedExpr typedexpr_1, typedexpr_2;
  public EWithSubCont(TypedExpr p1, TypedExpr p2) { typedexpr_1 = p1; typedexpr_2 = p2; }

  public <R,A> R accept(rholang.parsing.delimc.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.delimc.Absyn.EWithSubCont) {
      rholang.parsing.delimc.Absyn.EWithSubCont x = (rholang.parsing.delimc.Absyn.EWithSubCont)o;
      return this.typedexpr_1.equals(x.typedexpr_1) && this.typedexpr_2.equals(x.typedexpr_2);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.typedexpr_1.hashCode())+this.typedexpr_2.hashCode();
  }


}
