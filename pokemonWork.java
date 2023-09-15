public class pokemonWork {
  public static void  main(String[] args) {
    pokemon pokemon01 = new pokemon("pikaju", 10, 50, 30);
    pokemon pokemon02 = new pokemon("slowbros", 50, 10, 50);
    electric pokemon03 = new electric("raiju", 20, 60, 40);
    water pokemon04 = new water(null, 0, 0, 0);
    flying pokemon05 = new flying(null, 0, 0, 0);

    System.out.println(pokemon02.getHp());
    pokemon03.attack(pokemon02);
    System.out.println(pokemon02.getHp());

/*     pokemon01.attack();
    pokemon02.attack();
    pokemon03.attack();
    pokemon04.aquatail();
    pokemon05.dragonascend();
     */
  }
}
