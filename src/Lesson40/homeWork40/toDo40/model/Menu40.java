package Lesson40.homeWork40.toDo40.model;

public enum Menu40 {

    LIST(1),ADD(2),REMOVE(3),FIND(4),EXIT(5 );
    //fields
    private int menuItem;
    //constructor
    Menu40(int menuItem) {
        this.menuItem = menuItem;
    }
   //getters and setters


    public int getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(int menuItem) {
        this.menuItem = menuItem;
    }
    //method print
    public static void printMenu(){
        Menu40 []menu40 = Menu40.values();
        for (int i = 0; i < menu40.length; i++) {
            System.out.println(menu40[i].menuItem+ "-" +menu40[i]);

        }
    }

}
