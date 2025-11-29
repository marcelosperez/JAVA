/*
 * This is part of the Exercism Java track
 * that I'm using to practice Java
 * Code altered to include exception handling
 * 
 */

public class AnnalynsInfiltrationWithException {
    public static boolean canFastAttack(boolean knightIsAwake) {         
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean dogIsPresent) {
        return (dogIsPresent && !archerIsAwake) || (!dogIsPresent && prisonerIsAwake && !knightIsAwake && !archerIsAwake);
    }

    public static void main(String[] args) {
        try {
            boolean knightIsAwake = true;
            System.out.println(canFastAttack(knightIsAwake)); // false

            knightIsAwake = false;
            boolean archerIsAwake = true;
            boolean prisonerIsAwake = false;
            System.out.println(canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake)); // true

            archerIsAwake = false;
            prisonerIsAwake = true;
            System.out.println(canSignalPrisoner(archerIsAwake, prisonerIsAwake)); // true

            knightIsAwake = false;
            archerIsAwake = true;
            prisonerIsAwake = false;
            boolean petDogIsPresent = false;
            System.out.println(canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent)); // false
        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante a execução: " + e.getMessage());
            e.printStackTrace();
        }
    }
}