/**
* This program adds more style and
* comments to the greeting program.
*
* @author  Joseph Wondimagnehu
* @version 2.0
* @since   2025-09-08
*/
public final class HelloWorldStyle {
  /**
   * Creates a private constructor
   * to satisfy the style checker.
   * @exception IllegalStateException for the utility class.
   * @see IllegalStateException
   */
  private HelloWorldStyle() {
    // Prevents illegal states.
    throw new IllegalStateException("Utility class.");
  }

  /**
   * Defines the entry point of the program.
   *
   * @param args unused, for now.
   */
  public static void main(final String[] args) {
    // Greets Beni.
    System.out.println("\nHello, Beni! With style!");
    // Outputs an additional statement.
    System.out.println(
      "Java is the superior language!"
      + " In my opinion, of course.\n"
    );
  }
}
