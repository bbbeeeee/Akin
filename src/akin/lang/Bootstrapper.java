package akin.lang;

import java.io.*;
import java.awt.*;
import javax.swing.JPanel;

/**
  Bootstrapper.run() is called to initialize the runtime.
  Core classes are created and methods are added.
*/
public class Bootstrapper {
  static public Context run() {
    // Create core classes
    AkinClass objectClass = new AkinClass("Object");
    AkinRuntime.objectClass = objectClass;
    // Each method sent or added on the root context of a script are evaled on the main object.
    AkinObject main = new AkinObject();
    AkinRuntime.mainObject = main;
    AkinClass classClass = new AkinClass("Class");
    objectClass.setAkinClass(classClass); // Object is a class
    classClass.setAkinClass(classClass); // Class is a class
    main.setAkinClass(objectClass);
    
    // Register core classes into the root context
    objectClass.setConstant("Object", objectClass);
    objectClass.setConstant("Class", classClass);
    // There is just one instance of nil, true, false, so we store those in constants.
    AkinRuntime.nilObject = objectClass.newSubclass("NilClass").newInstance(null);
    AkinRuntime.trueObject = objectClass.newSubclass("TrueClass").newInstance(true);
    AkinRuntime.falseObject = objectClass.newSubclass("FalseClass").newInstance(false);
    AkinClass stringClass = objectClass.newSubclass("String");
    AkinClass numberClass = objectClass.newSubclass("Number");
    AkinClass integerClass = numberClass.newSubclass("Integer");
    AkinClass floatClass = numberClass.newSubclass("Float");
    AkinClass arrayClass = objectClass.newSubclass("Array");
    AkinClass exceptionClass = objectClass.newSubclass("Exception");
    exceptionClass.newSubclass("IOException");
    exceptionClass.newSubclass("TypeError");
    exceptionClass.newSubclass("MethodNotFound");
    exceptionClass.newSubclass("ArgumentError");
    exceptionClass.newSubclass("FileNotFound");
    
    // Add methods to core classes.
    
    //// Object
    objectClass.addMethod("print", new Method() {
      public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
        for (AkinObject arg : arguments) System.out.println(arg.toJavaObject());
        return AkinRuntime.getNil();
      }
    });
    objectClass.addMethod("Print", new Method() {
        public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
          for (AkinObject arg : arguments) System.out.println(arg.toJavaObject());
          return AkinRuntime.getNil();
        }
      });
    objectClass.addMethod("write", new Method() {
        public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
          for (AkinObject arg : arguments) System.out.println(arg.toJavaObject());
          return AkinRuntime.getNil();
        }
      });
    objectClass.addMethod("Write", new Method() {
        public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
          for (AkinObject arg : arguments) System.out.println(arg.toJavaObject());
          return AkinRuntime.getNil();
        }
      });
    objectClass.addMethod("class", new Method() {
      public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
        return receiver.getAkinClass();
      }
    });
   
    objectClass.addMethod("eval", new Method() {
      public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
        Context context = new Context(receiver);
        String code = arguments[0].asString();
        return context.eval(code);
      }
    });
    objectClass.addMethod("require", new Method() {
      public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
        Context context = new Context();
        String filename = arguments[0].asString();
        try {
          return context.eval(new FileReader(filename));
        } catch (FileNotFoundException e) {
          throw new AkinException("FileNotFound", "File not found: " + filename);
        }
      }
    });
    objectClass.addMethod("usethefile", new Method() {
        public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
          Context context = new Context();
          String filename = arguments[0].asString();
          try {
            return context.eval(new FileReader(filename));
          } catch (FileNotFoundException e) {
            throw new AkinException("FileNotFound", "File not found: " + filename);
          }
        }
      });
    objectClass.addMethod("take_input", new Method() {
        public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
          Console console = System.console();
          String string = arguments[0].asString();
          String s = console.readLine(string);
          return new ValueObject(s);
        }
      });
    objectClass.addMethod("input_of", new Method() {
        public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
          Console console = System.console();
          String string = arguments[0].asString();
          String s = console.readLine(string);
          return new ValueObject(s);
        }
      });
    objectClass.addMethod("input", new Method() {
        public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
          Console console = System.console();
          String string = arguments[0].asString();
          String s = console.readLine(string);
          return new ValueObject(s);
        }
      });
    objectClass.addMethod("random_number", new Method() {
        public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
        	int min = arguments[0].asInteger();
        	int max = arguments[1].asInteger();
        	int x = min + (int)(Math.random() * ((max - min) + 1));
        	
        	return new ValueObject(x);
        }
      });
    //// Class
    classClass.addMethod("new", new Method() {
      public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
        AkinClass self = (AkinClass) receiver;
        AkinObject instance = self.newInstance();
        if (self.hasMethod("initialize")) instance.call("initialize", arguments);
        return instance;
      }
    });
    classClass.addMethod("name", new Method() {
      public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
        AkinClass self = (AkinClass) receiver;
        return new ValueObject(self.getName());
      }
    });
    classClass.addMethod("superclass", new Method() {
      public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
        AkinClass self = (AkinClass) receiver;
        return self.getSuperClass();
      }
    });

    //// Exception
    exceptionClass.addMethod("initialize", new Method() {
      public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
        if (arguments.length == 1) receiver.setInstanceVariable("message", arguments[0]);
        return AkinRuntime.getNil();
      }
    });
    exceptionClass.addMethod("message", new Method() {
      public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
        return receiver.getInstanceVariable("message");
      }
    });
    objectClass.addMethod("raise!", new Method() {
      public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
        String message = null;
        if (receiver.hasInstanceVariable("message")) message = receiver.getInstanceVariable("message").asString();
        throw new AkinException(receiver.getAkinClass(), message);
      }
    });
    
    //// Integer
    integerClass.addMethod("+", new OperatorMethod<Integer>() {
      public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
        return new ValueObject(receiver + argument);
      }
    });
    integerClass.addMethod("-", new OperatorMethod<Integer>() {
      public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
        return new ValueObject(receiver - argument);
      }
    });
    integerClass.addMethod("*", new OperatorMethod<Integer>() {
      public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
        return new ValueObject(receiver * argument);
      }
    });
    integerClass.addMethod("/", new OperatorMethod<Integer>() {
      public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
        return new ValueObject(receiver / argument);
      }
    });
    integerClass.addMethod("<", new OperatorMethod<Integer>() {
      public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
        return AkinRuntime.toBoolean(receiver < argument);
      }
    });
    integerClass.addMethod("is less than", new OperatorMethod<Integer>() {
        public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
          return AkinRuntime.toBoolean(receiver < argument);
        }
      });
    integerClass.addMethod(">", new OperatorMethod<Integer>() {
      public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
        return AkinRuntime.toBoolean(receiver > argument);
      }
    });
    integerClass.addMethod("is greater than", new OperatorMethod<Integer>() {
        public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
          return AkinRuntime.toBoolean(receiver > argument);
        }
      });
    integerClass.addMethod("<=", new OperatorMethod<Integer>() {
      public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
        return AkinRuntime.toBoolean(receiver <= argument);
      }
    });
    integerClass.addMethod("is less than or equal to", new OperatorMethod<Integer>() {
        public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
          return AkinRuntime.toBoolean(receiver <= argument);
        }
      });
    integerClass.addMethod(">=", new OperatorMethod<Integer>() {
      public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
        return AkinRuntime.toBoolean(receiver >= argument);
      }
    });
    integerClass.addMethod("is greater than or equal to", new OperatorMethod<Integer>() {
        public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
          return AkinRuntime.toBoolean(receiver >= argument);
        }
      });
    integerClass.addMethod("==", new OperatorMethod<Integer>() {
      public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
        return AkinRuntime.toBoolean(receiver == argument);
      }
    });
    integerClass.addMethod("is equal to", new OperatorMethod<Integer>() {
        public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
          return AkinRuntime.toBoolean(receiver == argument);
        }
      });
    integerClass.addMethod("is not equal to", new OperatorMethod<Integer>() {
        public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
          return AkinRuntime.toBoolean(receiver != argument);
        }
      });
    integerClass.addMethod("!=", new OperatorMethod<Integer>() {
        public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
          return AkinRuntime.toBoolean(receiver != argument);
        }
      });
    integerClass.addMethod("as_a_string", new Method() {
        public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
        	int x = receiver.asInteger();
        	int y = x + 0;
        	return new ValueObject(Integer.toString(y));
        }
      });
    //// Float
    
    floatClass.addMethod("+", new OperatorMethod<Float>() {
        public AkinObject perform(Float receiver, Float argument) throws AkinException {
          return new ValueObject(receiver + argument);
        }
      });
      floatClass.addMethod("-", new OperatorMethod<Float>() {
        public AkinObject perform(Float receiver, Float argument) throws AkinException {
          return new ValueObject(receiver - argument);
        }
      });
      floatClass.addMethod("*", new OperatorMethod<Float>() {
        public AkinObject perform(Float receiver, Float argument) throws AkinException {
          return new ValueObject(receiver * argument);
        }
      });
      floatClass.addMethod("/", new OperatorMethod<Float>() {
        public AkinObject perform(Float receiver, Float argument) throws AkinException {
          return new ValueObject(receiver / argument);
        }
      });
      floatClass.addMethod("<", new OperatorMethod<Float>() {
        public AkinObject perform(Float receiver, Float argument) throws AkinException {
          return AkinRuntime.toBoolean(receiver < argument);
        }
      });
      floatClass.addMethod("is less than", new OperatorMethod<Float>() {
          public AkinObject perform(Float receiver, Float argument) throws AkinException {
            return AkinRuntime.toBoolean(receiver < argument);
          }
        });
      floatClass.addMethod(">", new OperatorMethod<Float>() {
        public AkinObject perform(Float receiver, Float argument) throws AkinException {
          return AkinRuntime.toBoolean(receiver > argument);
        }
      });
      floatClass.addMethod("is greater than", new OperatorMethod<Float>() {
          public AkinObject perform(Float receiver, Float argument) throws AkinException {
            return AkinRuntime.toBoolean(receiver > argument);
          }
        });
      floatClass.addMethod("<=", new OperatorMethod<Float>() {
        public AkinObject perform(Float receiver, Float argument) throws AkinException {
          return AkinRuntime.toBoolean(receiver <= argument);
        }
      });
      floatClass.addMethod("is less than or equal to", new OperatorMethod<Float>() {
          public AkinObject perform(Float receiver, Float argument) throws AkinException {
            return AkinRuntime.toBoolean(receiver <= argument);
          }
        });
      floatClass.addMethod(">=", new OperatorMethod<Float>() {
        public AkinObject perform(Float receiver, Float argument) throws AkinException {
          return AkinRuntime.toBoolean(receiver >= argument);
        }
      });
      floatClass.addMethod("is greater than or equal to", new OperatorMethod<Float>() {
          public AkinObject perform(Float receiver, Float argument) throws AkinException {
            return AkinRuntime.toBoolean(receiver >= argument);
          }
        });
      floatClass.addMethod("==", new OperatorMethod<Float>() {
        public AkinObject perform(Float receiver, Float argument) throws AkinException {
          return AkinRuntime.toBoolean(receiver == argument);
        }
      }); 
      floatClass.addMethod("is equal to", new OperatorMethod<Float>() {
          public AkinObject perform(Float receiver, Float argument) throws AkinException {
            return AkinRuntime.toBoolean(receiver == argument);
          }
        }); 
      floatClass.addMethod("is not equal to", new OperatorMethod<Integer>() {
          public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
            return AkinRuntime.toBoolean(receiver != argument);
          }
        });
      floatClass.addMethod("!=", new OperatorMethod<Integer>() {
          public AkinObject perform(Integer receiver, Integer argument) throws AkinException {
            return AkinRuntime.toBoolean(receiver != argument);
          }
        });
      
    //// String
    stringClass.addMethod("+", new OperatorMethod<String>() {
      public AkinObject perform(String receiver, String argument) throws AkinException {
        return new ValueObject(receiver + argument);
      }
    });
    stringClass.addMethod("size", new Method() {
      public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
        String self = receiver.asString();
        return new ValueObject(self.length());
      }
    });
    stringClass.addMethod("substring", new Method() {
      public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
        String self = receiver.asString();
        if (arguments.length == 0) throw new ArgumentError("substring", 1, 0);
        int start = arguments[0].asInteger();
        int end = self.length();
        if (arguments.length > 1) end = arguments[1].asInteger();
        return new ValueObject(self.substring(start, end));
      }
    });
    stringClass.addMethod("as_a_string", new Method() {
        public AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException {
        	String self = receiver.asString();
        	
        	return new ValueObject(self);
        }
      });
    // Return the root context on which everything will be evaled. By default, everything is evaled on the
    // main object.
    return new Context(main);
  }
}