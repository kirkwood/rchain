package rholang.parsing.rholang1.Absyn; // Java Package generated by the BNF Converter.

public class DContr extends Contr {
  public final String name_;
  public final ListPattern listpattern_;
  public final Expr expr_;
  public DContr(String p1, ListPattern p2, Expr p3) { name_ = p1; listpattern_ = p2; expr_ = p3; }

  public <R,A> R accept(rholang.parsing.rholang1.Absyn.Contr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang1.Absyn.DContr) {
      rholang.parsing.rholang1.Absyn.DContr x = (rholang.parsing.rholang1.Absyn.DContr)o;
      return this.name_.equals(x.name_) && this.listpattern_.equals(x.listpattern_) && this.expr_.equals(x.expr_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(this.name_.hashCode())+this.listpattern_.hashCode())+this.expr_.hashCode();
  }


}
