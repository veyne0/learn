import static com.my.utils.prints.*;
class annimal {
    String name ;
    int age ;
    public void z(){
        print("动物名字"+ name);
        print("动物年龄" + age);
    }
}
class cat extends annimal{
     void jiesao(){
        super.z();
    }
    public static void main(String[] arg){
         cat j = new cat();
         j.jiesao();


    }
}