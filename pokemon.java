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

  public void attack(pokemon pokemonTarget){
    System.out.println(name+  " attack...");
    int targetHP = pokemonTarget.getHp();
    pokemonTarget.setHp(targetHP-getHitpoint());
  }

  public void defend() {}

  public String getName(){
    return name;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getHitpoint() {
    return hitpoint;
  }
 
}

class electric extends pokemon {

  electric(String name, int armor, int hitpoint, int hp) {
    super(name, armor, hitpoint, hp);
    //TODO Auto-generated constructor stub
  }

  @Override 

  public void attack(pokemon pokemonTarget){
    System.out.println(getName() +" electric ATTACK !!!");
    int targetHP = pokemonTarget.getHp();
    pokemonTarget.setHp(targetHP-getHitpoint());
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