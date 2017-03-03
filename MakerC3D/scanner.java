
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu Mar 02 23:13:00 CST 2017
//----------------------------------------------------

package org.compi2.codigo3d.parser;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu Mar 02 23:13:00 CST 2017
  */
public class scanner extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public scanner() {super();}

  /** Constructor which sets the default scanner. */
  public scanner(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public scanner(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\030\000\002\002\004\000\002\006\002\000\002\002" +
    "\004\000\002\005\005\000\002\005\005\000\002\005\004" +
    "\000\002\005\003\000\002\004\005\000\002\004\005\000" +
    "\002\004\005\000\002\004\005\000\002\004\005\000\002" +
    "\004\005\000\002\004\003\000\002\003\005\000\002\003" +
    "\005\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\004\000\002\003\005\000\002\003\003\000" +
    "\002\003\003\000\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\016\004\000\005\000\006\000\010\000\014" +
    "\000\026\000\001\002\000\016\004\016\005\013\006\007" +
    "\010\010\014\011\026\012\001\002\000\004\002\006\001" +
    "\002\000\004\002\001\001\002\000\040\002\uffea\007\uffea" +
    "\010\uffea\011\uffea\012\uffea\013\uffea\015\uffea\016\uffea\017" +
    "\uffea\020\uffea\021\uffea\022\uffea\023\uffea\024\uffea\025\uffea" +
    "\001\002\000\014\004\016\005\013\006\007\010\010\014" +
    "\011\001\002\000\014\004\016\005\013\006\007\010\010" +
    "\014\011\001\002\000\016\004\016\005\013\006\007\010" +
    "\010\014\011\026\012\001\002\000\040\002\uffeb\007\uffeb" +
    "\010\uffeb\011\uffeb\012\uffeb\013\uffeb\015\uffeb\016\uffeb\017" +
    "\uffeb\020\uffeb\021\uffeb\022\uffeb\023\uffeb\024\uffeb\025\uffeb" +
    "\001\002\000\024\002\ufffb\016\036\017\037\020\041\021" +
    "\040\022\043\023\042\024\ufffb\025\ufffb\001\002\000\036" +
    "\002\ufff4\007\024\010\026\011\025\012\030\013\027\016" +
    "\ufff4\017\ufff4\020\ufff4\021\ufff4\022\ufff4\023\ufff4\024\ufff4" +
    "\025\ufff4\001\002\000\040\002\uffec\007\uffec\010\uffec\011" +
    "\uffec\012\uffec\013\uffec\015\uffec\016\uffec\017\uffec\020\uffec" +
    "\021\uffec\022\uffec\023\uffec\024\uffec\025\uffec\001\002\000" +
    "\010\002\uffff\024\021\025\020\001\002\000\016\004\016" +
    "\005\013\006\007\010\010\014\011\026\012\001\002\000" +
    "\016\004\016\005\013\006\007\010\010\014\011\026\012" +
    "\001\002\000\010\002\ufffe\024\ufffe\025\ufffe\001\002\000" +
    "\010\002\ufffd\024\021\025\ufffd\001\002\000\014\004\016" +
    "\005\013\006\007\010\010\014\011\001\002\000\014\004" +
    "\016\005\013\006\007\010\010\014\011\001\002\000\014" +
    "\004\016\005\013\006\007\010\010\014\011\001\002\000" +
    "\014\004\016\005\013\006\007\010\010\014\011\001\002" +
    "\000\014\004\016\005\013\006\007\010\010\014\011\001" +
    "\002\000\040\002\ufff0\007\ufff0\010\ufff0\011\ufff0\012\ufff0" +
    "\013\027\015\ufff0\016\ufff0\017\ufff0\020\ufff0\021\ufff0\022" +
    "\ufff0\023\ufff0\024\ufff0\025\ufff0\001\002\000\040\002\uffef" +
    "\007\uffef\010\uffef\011\uffef\012\uffef\013\027\015\uffef\016" +
    "\uffef\017\uffef\020\uffef\021\uffef\022\uffef\023\uffef\024\uffef" +
    "\025\uffef\001\002\000\040\002\ufff2\007\ufff2\010\ufff2\011" +
    "\025\012\030\013\027\015\ufff2\016\ufff2\017\ufff2\020\ufff2" +
    "\021\ufff2\022\ufff2\023\ufff2\024\ufff2\025\ufff2\001\002\000" +
    "\040\002\ufff1\007\ufff1\010\ufff1\011\ufff1\012\ufff1\013\027" +
    "\015\ufff1\016\ufff1\017\ufff1\020\ufff1\021\ufff1\022\ufff1\023" +
    "\ufff1\024\ufff1\025\ufff1\001\002\000\040\002\ufff3\007\ufff3" +
    "\010\ufff3\011\025\012\030\013\027\015\ufff3\016\ufff3\017" +
    "\ufff3\020\ufff3\021\ufff3\022\ufff3\023\ufff3\024\ufff3\025\ufff3" +
    "\001\002\000\014\004\016\005\013\006\007\010\010\014" +
    "\011\001\002\000\014\004\016\005\013\006\007\010\010" +
    "\014\011\001\002\000\014\004\016\005\013\006\007\010" +
    "\010\014\011\001\002\000\014\004\016\005\013\006\007" +
    "\010\010\014\011\001\002\000\014\004\016\005\013\006" +
    "\007\010\010\014\011\001\002\000\014\004\016\005\013" +
    "\006\007\010\010\014\011\001\002\000\024\002\ufff6\016" +
    "\ufff6\017\ufff6\020\ufff6\021\ufff6\022\ufff6\023\ufff6\024\ufff6" +
    "\025\ufff6\001\002\000\024\002\ufff5\016\ufff5\017\ufff5\020" +
    "\ufff5\021\ufff5\022\ufff5\023\ufff5\024\ufff5\025\ufff5\001\002" +
    "\000\024\002\ufff8\016\ufff8\017\ufff8\020\ufff8\021\ufff8\022" +
    "\ufff8\023\ufff8\024\ufff8\025\ufff8\001\002\000\024\002\ufff7" +
    "\016\ufff7\017\ufff7\020\ufff7\021\ufff7\022\ufff7\023\ufff7\024" +
    "\ufff7\025\ufff7\001\002\000\024\002\ufff9\016\ufff9\017\ufff9" +
    "\020\ufff9\021\ufff9\022\ufff9\023\ufff9\024\ufff9\025\ufff9\001" +
    "\002\000\024\002\ufffa\016\ufffa\017\ufffa\020\ufffa\021\ufffa" +
    "\022\ufffa\023\ufffa\024\ufffa\025\ufffa\001\002\000\010\002" +
    "\ufffc\024\021\025\020\001\002\000\016\007\024\010\026" +
    "\011\025\012\030\013\027\015\054\001\002\000\040\002" +
    "\uffed\007\uffed\010\uffed\011\uffed\012\uffed\013\uffed\015\uffed" +
    "\016\uffed\017\uffed\020\uffed\021\uffed\022\uffed\023\uffed\024" +
    "\uffed\025\uffed\001\002\000\040\002\uffee\007\uffee\010\uffee" +
    "\011\025\012\030\013\027\015\uffee\016\uffee\017\uffee\020" +
    "\uffee\021\uffee\022\uffee\023\uffee\024\uffee\025\uffee\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\006\002\004\006\003\001\001\000\010\003" +
    "\014\004\013\005\016\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\003\054\001\001\000" +
    "\004\003\052\001\001\000\010\003\014\004\013\005\051" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\003\014" +
    "\004\013\005\022\001\001\000\010\003\014\004\013\005" +
    "\021\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\034\001\001\000\004\003\033\001\001\000\004\003" +
    "\032\001\001\000\004\003\031\001\001\000\004\003\030" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\003\014" +
    "\004\050\001\001\000\006\003\014\004\047\001\001\000" +
    "\006\003\014\004\046\001\001\000\006\003\014\004\045" +
    "\001\001\000\006\003\014\004\044\001\001\000\006\003" +
    "\014\004\043\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$scanner$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$scanner$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$scanner$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


//Codigo visible

    public void syntax_error(Symbol s){
        System.err.println(s);
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.err.println("T.T");
        System.err.println(s);
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$scanner$actions {

//Codigo de acciones
      

  private final scanner parser;

  /** Constructor */
  CUP$scanner$actions(scanner parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$scanner$do_action(
    int                        CUP$scanner$act_num,
    java_cup.runtime.lr_parser CUP$scanner$parser,
    java.util.Stack            CUP$scanner$stack,
    int                        CUP$scanner$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$scanner$result;

      /* select the action based on the action number */
      switch (CUP$scanner$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expresion ::= DECIMAL 
            {
              NodoC3D RESULT =null;
		int decimalleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int decimalright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		String decimal = (String)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 RESULT = new NodoC3D(decimal); 
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expresion ::= ENTERO 
            {
              NodoC3D RESULT =null;
		int enteroleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int enteroright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		String entero = (String)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 RESULT = new NodoC3D(entero); 
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expresion ::= ID 
            {
              NodoC3D RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 RESULT = new NodoC3D(id); 
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expresion ::= PAR_IZQ expresion PAR_DER 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-1)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-1)).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.elementAt(CUP$scanner$top-1)).value;
		 RESULT = exp; 
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expresion ::= MENOS expresion 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = - " + exp.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-1)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expresion ::= expresion POT expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.elementAt(CUP$scanner$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " ^ " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expresion ::= expresion DIV expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.elementAt(CUP$scanner$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " / " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expresion ::= expresion MULT expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.elementAt(CUP$scanner$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " * " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expresion ::= expresion MENOS expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.elementAt(CUP$scanner$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " - " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expresion ::= expresion MAS expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.elementAt(CUP$scanner$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " + " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // comparacion ::= expresion 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 RESULT = exp; 
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("comparacion",2, ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // comparacion ::= comparacion MENOR_IGUAL comparacion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.elementAt(CUP$scanner$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 
                            String temp = ControlC3D.generaTemp();
                            String c3d = temp + " = " + izq.getCad() + " <= " + der.getCad() + ";\n";
                            ControlC3D.agregarC3D(c3d);
                            RESULT = new NodoC3D(temp); 
                        
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("comparacion",2, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // comparacion ::= comparacion MAYOR_IGUAL comparacion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.elementAt(CUP$scanner$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 
                            String temp = ControlC3D.generaTemp();
                            String c3d = temp + " = " + izq.getCad() + " >= " + der.getCad() + ";\n";
                            ControlC3D.agregarC3D(c3d);
                            RESULT = new NodoC3D(temp); 
                        
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("comparacion",2, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // comparacion ::= comparacion MENOR comparacion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.elementAt(CUP$scanner$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 
                            String temp = ControlC3D.generaTemp();
                            String c3d = temp + " = " + izq.getCad() + " < " + der.getCad() + ";\n";
                            ControlC3D.agregarC3D(c3d);
                            RESULT = new NodoC3D(temp); 
                        
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("comparacion",2, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // comparacion ::= comparacion MAYOR comparacion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.elementAt(CUP$scanner$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 
                            String temp = ControlC3D.generaTemp();
                            String c3d = temp + " = " + izq.getCad() + " > " + der.getCad() + ";\n";
                            ControlC3D.agregarC3D(c3d);
                            RESULT = new NodoC3D(temp); 
                        
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("comparacion",2, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // comparacion ::= comparacion DIFERENTE comparacion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.elementAt(CUP$scanner$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 
                            String temp = ControlC3D.generaTemp();
                            String c3d = temp + " = " + izq.getCad() + " != " + der.getCad() + ";\n";
                            ControlC3D.agregarC3D(c3d);
                            RESULT = new NodoC3D(temp); 
                        
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("comparacion",2, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // comparacion ::= comparacion IGUAL comparacion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.elementAt(CUP$scanner$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 
                            String temp = ControlC3D.generaTemp();
                            String c3d = temp + " = " + izq.getCad() + " == " + der.getCad() + ";\n";
                            ControlC3D.agregarC3D(c3d);
                            RESULT = new NodoC3D(temp); 
                        
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("comparacion",2, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // condicion ::= comparacion 
            {
              NodoC3D RESULT =null;
		int compleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int compright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D comp = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 RESULT = comp; 
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("condicion",3, ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // condicion ::= LOG_NOT condicion 
            {
              NodoC3D RESULT =null;
		int condleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int condright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D cond = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 
                            String temp = ControlC3D.generaTemp();
                            String c3d = temp + " =  ! " + cond.getCad() + ";\n";
                            ControlC3D.agregarC3D(c3d);
                            RESULT = new NodoC3D(temp); 
                     
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("condicion",3, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-1)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // condicion ::= condicion LOG_OR condicion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.elementAt(CUP$scanner$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 
                            String temp = ControlC3D.generaTemp();
                            String c3d = temp + " = " + izq.getCad() + " || " + der.getCad() + ";\n";
                            ControlC3D.agregarC3D(c3d);
                            RESULT = new NodoC3D(temp); 
                     
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("condicion",3, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // condicion ::= condicion LOG_AND condicion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.elementAt(CUP$scanner$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 
                            String temp = ControlC3D.generaTemp();
                            String c3d = temp + " = " + izq.getCad() + " && " + der.getCad() + ";\n";
                            ControlC3D.agregarC3D(c3d);
                            RESULT = new NodoC3D(temp); 
                     
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("condicion",3, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-2)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicial ::= NT$0 condicion 
            {
              NodoC3D RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (NodoC3D) ((java_cup.runtime.Symbol) CUP$scanner$stack.elementAt(CUP$scanner$top-1)).value;
		int condleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).left;
		int condright = ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()).right;
		NodoC3D cond = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.peek()).value;
		 
                        RESULT = cond;
                        ControlC3D.agregarC3D("//Último valor: " + cond.getCad());
                    
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("inicial",0, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-1)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              NodoC3D RESULT =null;
 ControlC3D.reiniciar(); 
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("NT$0",4, ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          return CUP$scanner$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicial EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-1)).right;
		NodoC3D start_val = (NodoC3D)((java_cup.runtime.Symbol) CUP$scanner$stack.elementAt(CUP$scanner$top-1)).value;
		RESULT = start_val;
              CUP$scanner$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$scanner$stack.elementAt(CUP$scanner$top-1)), ((java_cup.runtime.Symbol)CUP$scanner$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$scanner$parser.done_parsing();
          return CUP$scanner$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

