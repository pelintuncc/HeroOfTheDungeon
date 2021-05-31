package com.company;

public class Monster {
    private String name;
    private int healthPoints,attackSpeed,attackDamage;
    private String specialities;

    public Monster(String name,int healthPoints,int attackSpeed,int attackDamage,String specialities){
        this.name=name;
        this.healthPoints=healthPoints;
        this.attackSpeed=attackSpeed;
        this.attackDamage=attackDamage;
        this.specialities=specialities;
    }



    public Monster(){
        this.name=null;
        this.healthPoints=0;
        this.attackSpeed=0;
        this.attackDamage=0;
        this.specialities=null;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setSpecialities(String specialities) {
        this.specialities = specialities;
    }

    public String getName() {
        return name;
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

    public String getSpecialities() {
        return specialities;
    }
}
