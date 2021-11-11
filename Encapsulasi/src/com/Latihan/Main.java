package com.Latihan;

class Player{

    private int baseHealth;
    private String name;
    private Armor armor;

    public Player(String name){
        this.name = name;
        this.baseHealth = 100;

    }

    public  void display(){
        System.out.println("Player : " + this.name);
        System.out.println("Health : " + this.baseHealth);
    }

    public void setArmor(Armor armor){
        this.armor = armor;
    }

    public  int maxHealth(){
        return this.baseHealth + this.armor.getStrength()

    }
}

class Armor{
    private String name;
    private  int strength;

    public Armor(String name){
        this.name = name;
        this.strength = strength;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player1 = new Player("Marni");
        Armor armor1 = new Armor("Baju besi",100);
        player1.setArmor(armor1);

        player1.display();
    }
}
