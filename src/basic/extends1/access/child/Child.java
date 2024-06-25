package basic.extends1.access.child;

import basic.extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1;
        //default 다른 패키지 불가
        //private 접근 불가

        publicMethod();
        protectedMethod();

        printParent();
    }
}
