package contollerTest;
class ParentClass {
    public String field = "父类变量";
}

class SubClass extends ParentClass {
    protected String field = "子类变量";
    public SubClass(){
        System.out.println(super.field) ;
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println(subClass.field);
    }
}