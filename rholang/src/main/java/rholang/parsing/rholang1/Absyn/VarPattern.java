package rholang.parsing.rholang1.Absyn; // Java Package generated by the BNF Converter.

public abstract class VarPattern implements java.io.Serializable {
  public abstract <R,A> R accept(VarPattern.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(rholang.parsing.rholang1.Absyn.VarPtVar p, A arg);
    public R visit(rholang.parsing.rholang1.Absyn.VarPtWild p, A arg);

  }

}
