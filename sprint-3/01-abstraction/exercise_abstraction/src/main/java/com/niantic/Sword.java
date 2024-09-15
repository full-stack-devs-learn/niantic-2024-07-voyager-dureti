package com.niantic;

public class Sword extends Weapon
{
    private int daggerCount;

    public Sword(String name, int damage, int daggerCount) {
        super(name, damage);
        this.daggerCount = daggerCount;
    }

    @Override
    public int attack() {
        int percentCharged = getPercentCharged();
        percentCharged += 10;

        if (percentCharged > 100) {
            percentCharged = 100;
        }
        setPercentCharged(percentCharged);
        return getDamage();
    }
    @Override
    public int powerAttack() {
        int percentCharged = getPercentCharged();

        if (percentCharged < 50) {
            return attack();

        } else if (percentCharged >= 50 && percentCharged < 100) {
            int damage = getDamage() * 2;
            setPercentCharged(percentCharged - 50);
            return damage;

        } else if (percentCharged == 100) {
            int damage = getDamage() * 4;
            setPercentCharged(0);
            return damage;
        }
        return attack();
    }

    @Override
    public int getRange()
    {
        return 1;
    }

}
