package thinkinginpatterns.main.patternrefactoring;

/**
 * A class to create required objects of type {@link Trash}.
 *
 */
public class Messanger {
    int type;
    //Must change this to add another type
    static final int MAX_NUM = 4;
    double data;
    Messanger(int typeNum, double val) {
        type = typeNum % MAX_NUM;
        data = val;
    }
}
