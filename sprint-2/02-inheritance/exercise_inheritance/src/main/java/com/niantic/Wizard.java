package com.niantic;

public class Wizard extends Character {
    private int mana;

    public Wizard(String name, int health, int level, int experience, int mana) {
        super(name, health, level, experience);
        this.mana = mana;
    }

    public int getMana(){
        return mana;
    }

    public void castSpell(Character target) {
        if (isDefeated()) {
            System.out.println(this.getName() + " has been defeated and cannot cast a spell.");
            return;
        }
        if (mana < 10) {
            System.out.println("Not enough mana points to cast a spell. Current mana: " + this.mana);
            return;
        }

        // Casting spell
        System.out.println(this.getName() + " casts a spell on " + target.getName() + "!");
        target.takeDamage(attackDamage * 2);
        mana -= 10;
    }

    public void regenerateMana(int amount) {
        if (!isDefeated()) {
            this.mana += amount;
            System.out.println(this.getName() + " has regenerated mana to " + this.mana);
        } else {
            System.out.println(this.getName() + " is defeated and cannot regenerate mana.");
        }
    }

    @Override
    public void levelUp() {
        if (isDefeated()) {
            System.out.println(this.getName() + " has been defeated!");
            return;
        }
        super.levelUp();
        this.mana += 10;
    }

    @Override
    public String specialAbility() {
        return "Cast Spells";
    }
}
