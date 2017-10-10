package coop.rchain.syntax.rholang.Absyn; // Java Package generated by the BNF Converter.

public class PInject extends Proc {
  public final Chan chan_;
  public PInject(Chan p1) { chan_ = p1; }

  public <R,A> R accept(coop.rchain.syntax.rholang.Absyn.Proc.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.syntax.rholang.Absyn.PInject) {
      coop.rchain.syntax.rholang.Absyn.PInject x = (coop.rchain.syntax.rholang.Absyn.PInject)o;
      return this.chan_.equals(x.chan_);
    }
    return false;
  }

  public int hashCode() {
    return this.chan_.hashCode();
  }


}