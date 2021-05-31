package com.company;

public class Hero {

    private int healthPoints,attackSpeed,attackDamage,armor;
    private String type;

    public Hero(int healthPoints,int attackSpeed,int attackDamage,int armor,String type){
        this.healthPoints=healthPoints;
        this.attackSpeed=attackSpeed;
        this.attackDamage=attackDamage;
        this.armor=armor;
        this.type=type;
    }


    public Hero(){
        this.healthPoints=0;
        this.attackSpeed=0;
        this.attackDamage=0;
        this.armor=0;
        this.type=null;
    }

    public int attackToMonster(int attackDamage,int attackSpeed) {
        return attackDamage*attackSpeed;

    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getArmor() {
        return armor;
    }

    public String getType() {
        return type;
    }
    public void displayInfo(){
        System.out.println("Health Points: "+ healthPoints + "\nAttack Speed: "+ attackSpeed+"\nAttack Damage: "+ attackDamage+"\nArmor: "+armor+"\nType: "+type);
    }
}
