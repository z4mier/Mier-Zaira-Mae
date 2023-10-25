import java.util.Scanner;
public class AnimalSounds 
{
   public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);

   System.out.println("Select an animal: ");
   System.out.print("1. Dog \n2. Cat \n3. Cow \n4. Fox \nEnter a number: ");
   int response = scan.nextInt();

   switch (response) {
   case 1:
      response = 1;
      Dog arf = new Dog();
      arf.displayName();
      break;

   case 2:
      response = 2;
      Cat meow = new Cat();
      meow.displayName();
      break;

   case 3:
      response = 1;
      Cow moo = new Cow();
      moo.displayName();
      break;

   case 4:
      response = 4;
      Fox ding = new Fox();
      ding.displayName();
      break;

   default:
      System.out.print("Invalid Number!");
      return;
      }
   }
}

class Dog
{
   public void displayName() {
   System.out.print("Animal: Dog \nSound: Arf Arf!");
   }
}
   
   class Cat extends Dog
{
   public void displayName() {
   System.out.print("Animal: Cat \nSound: Meow Meow!");
   }
}

   class Cow extends Dog
{
   public void displayName() {
   System.out.print("Animal: Cow \nSound: Moo Moo!");
   }
}
   
   class Fox extends Dog
{
   public void displayName(){
   System.out.print("Animal: Fox \nSound: Ding Ding!");
   }
}
