package com.niantic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwordTest {
    private Sword sword;

        @BeforeEach
        public void setUp() {
            sword = new Sword("Stormbringer", 15, 2);
        }

        @Test
        public void newSword_shouldInitializeCorrectly() {
            // Arrange
            String expectedName = "Stormbringer";
            int expectedDamage = 15;
            int expectedPercentCharged = 0;

            // Act
            String actualName = sword.getName();
            int actualDamage = sword.getDamage();
            int actualPercentCharged = sword.getPercentCharged();

            // Assert
            assertEquals(expectedName, actualName, "The Sword's name should match the expected value");
            assertEquals(expectedDamage, actualDamage, "The Sword's damage should be " + expectedDamage);
            assertEquals(expectedPercentCharged, actualPercentCharged, "The initial percent charged should be " + expectedPercentCharged);
        }

        @Test
        public void attack_shouldIncreasePercentCharged() {
            // Arrange
            int initialDamage = sword.getDamage();
            int expectedPercentCharged = 10;

            // Act
            int damage = sword.attack();
            int actualPercentCharged = sword.getPercentCharged();

            // Assert
            assertEquals(initialDamage, damage, "The damage should remain the same after a normal attack");
            assertEquals(expectedPercentCharged, actualPercentCharged, "The percent charged should increase by 10 after an attack");
        }

        @Test
        public void powerAttack_whenLessThan50Percent_shouldPerformNormalAttack() {
            // Arrange
            sword.setPercentCharged(40);
            int expectedDamage = sword.getDamage();
            int expectedPercentCharged = 50;

            // Act
            int damage = sword.powerAttack();
            int actualPercentCharged = sword.getPercentCharged();

            // Assert
            assertEquals(expectedDamage, damage, "The damage should be the same as a normal attack when percent charged is less than 50");
            assertEquals(expectedPercentCharged, actualPercentCharged, "The percent charged should increase to 50 after a power attack with less than 50 percent charged");
        }

        @Test
        public void powerAttack_whenBetween50And100Percent_shouldDoubleDamage() {
            // Arrange
            sword.setPercentCharged(60);
            int expectedDamage = sword.getDamage() * 2;
            int expectedPercentCharged = 10;

            // Act
            int damage = sword.powerAttack();
            int actualPercentCharged = sword.getPercentCharged();

            // Assert
            assertEquals(expectedDamage, damage, "The damage should be doubled when percent charged is between 50 and 100");
            assertEquals(expectedPercentCharged, actualPercentCharged, "The percent charged should decrease by 50 after a power attack with percent charged between 50 and 100");
        }

        @Test
        public void powerAttack_when100Percent_shouldQuadrupleDamage() {
            // Arrange
            sword.setPercentCharged(100);
            int expectedDamage = sword.getDamage() * 4;
            int expectedPercentCharged = 0;

            // Act
            int damage = sword.powerAttack();
            int actualPercentCharged = sword.getPercentCharged();

            // Assert
            assertEquals(expectedDamage, damage, "The damage should be quadrupled when percent charged is 100");
            assertEquals(expectedPercentCharged, actualPercentCharged, "The percent charged should reset to 0 after a power attack with 100 percent charged");
        }

        @Test
        public void getRange_shouldReturnOne() {
            // Arrange
            int expectedRange = 1;

            // Act
            int actualRange = sword.getRange();

            // Assert
            assertEquals(expectedRange, actualRange, "The range of the Sword should be 1");
        }

}
