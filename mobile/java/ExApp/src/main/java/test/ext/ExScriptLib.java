package test.ext;

import org.mini.gui.gscript.DataType;
import org.mini.gui.gscript.Interpreter;
import org.mini.gui.gscript.Lib;

import java.util.ArrayList;

public class ExScriptLib extends Lib {

    {
        methodNames.put("func1".toLowerCase(), 0);//
        methodNames.put("func2".toLowerCase(), 1);//
    }

    public DataType call(Interpreter inp, ArrayList<DataType> para, int methodID) {
        switch (methodID) {
            case 0:
                return func1(para);
            case 1:
                return func2(para);
        }
        return null;
    }

    public DataType func1(ArrayList<DataType> para) {
        String str1 = Interpreter.popBackStr(para);
        String str2 = Interpreter.popBackStr(para);
        System.out.println(str1);
        System.out.println(str2);
        return null;
    }

    public DataType func2(ArrayList<DataType> para) {
        int a = Interpreter.popBackInt(para);
        int b = Interpreter.popBackInt(para);
        return Interpreter.getCachedInt(a + b);
    }
}