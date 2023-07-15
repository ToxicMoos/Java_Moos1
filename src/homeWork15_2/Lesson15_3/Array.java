package homeWork15_2.Lesson15_3;

public class Array {
    public String[] weekDAys ;
    //конструктор
    public Array(String[] weekDAys) {
        this.weekDAys = weekDAys;
    }
   //переопределяем дни
    public String [] redefineDays(){
        for (int i=0; i< weekDAys.length; i++){
            if (weekDAys[i]==weekDAys[0] ){
                System.out.println("Воскресенье");
            } else if (weekDAys[i]==weekDAys[6] ) {
                break;
            }
            System.out.println(weekDAys[i]);
        }
            return weekDAys;
    }

}
