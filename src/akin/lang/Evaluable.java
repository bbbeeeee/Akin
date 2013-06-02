package akin.lang;

import akin.lang.nodes.Node;

/**
  Anything that can be evaluated inside a context must implement this interface.
*/
public interface Evaluable {
  AkinObject eval(Context context) throws AkinException;
}
