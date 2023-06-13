public abstract class Department {
    public abstract int getdepartmentsize();
}
class depart extends Department {
    private int departmentsize;

    public depart(int size)
    {
        this.departmentsize = size;
    }
    public int getdepartmentsize()
    {
        return departmentsize;
    }

    public static void main(String args[]){
        Department d = new depart(20);
        System.out.println(d.getdepartmentsize());
    }
}
