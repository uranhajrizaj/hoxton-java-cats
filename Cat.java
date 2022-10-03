public class Cat {
    public String name;
    public Number age;
    public Boolean likesCuddles;
    public String cuddles;
    public Cat(String name, Number age,Boolean likesCuddles){
        this.name=name;
        this.age=age;
        this.likesCuddles=likesCuddles;
    }
    void DisplayInfo(){
        if(likesCuddles){
           this.cuddles="likes cuddles";
        } 
       else{
           this.cuddles="doesn't likes cuddles";
        } 
        System.out.printf("This is %s, who is %s years old. %s %s.\n",this.name,this.age,this.name,this.cuddles);
    }

}