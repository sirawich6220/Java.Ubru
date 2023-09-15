public class pokemon {
  private String name;
  private int armor;
  private int hitpoint;
  private int hp;

  pokemon(String name, int armor , int hitpoint , int hp){
    this.name = name;
    this.armor = armor; 
    this.hitpoint = hitpoint;
    this.hp = hp;
    

  }

  public void attack(){
    System.out.println(name+  " attack...");
  }

  public void defend() {}

  public String getName(){
    return name;
  }
 
}

class electric extends pokemon {

  electric(String name, int armor, int hitpoint, int hp) {
    super(name, armor, hitpoint, hp);
    //TODO Auto-generated constructor stub
  }

  @Override 

  public void attack(){
    System.out.println(getName() +" electric ATTACK !!!");
  }

}

class water extends pokemon {

  water(String name, int armor, int hitpoint, int hp) {
    super(name, armor, hitpoint, hp);
    //TODO Auto-generated constructor stub
  }
  public void aquatail() {}
  
}

class flying extends pokemon {

  flying(String name, int armor, int hitpoint, int hp) {
    super(name, armor, hitpoint, hp);
    //TODO Auto-generated constructor stub
  }

  public void dragonascend() {}
  
}