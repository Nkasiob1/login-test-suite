public class Main {

  // ============================================
  // SECTION 1 - METHODS (your reusable tools)
  // These go INSIDE the class but OUTSIDE main()
  // ============================================

  // METHOD 1 - checks login credentials
  static void checkLogin(String username, String password,
                         String testName, boolean expectSuccess) {

    String correctEmail = "precious@gmail.com";
    String correctPassword = "correct123";

    boolean loginSuccess = username.equals(correctEmail)
            && password.equals(correctPassword);

    if (loginSuccess == expectSuccess) {
      System.out.println(testName + ": PASSED ✓");
    } else {
      System.out.println(testName + ": FAILED ✗");
    }
  }

  // METHOD 2 - checks empty fields
  static void checkEmptyField(String value, String fieldName, String testName) {
    if (value.isEmpty()) {
      System.out.println(testName + ": PASSED ✓ - " + fieldName + " is empty as expected");
    } else {
      System.out.println(testName + ": FAILED ✗ - " + fieldName + " was not empty");
    }
  }

  // METHOD 3 - checks password length
  static void checkPasswordLength(String password, int minLength, String testName) {
    if (password.length() < minLength) {
      System.out.println(testName + ": PASSED ✓ - Short password correctly rejected");
    } else {
      System.out.println(testName + ": FAILED ✗ - Short password was not caught");
    }
  }

  // ============================================
  // SECTION 2 - MAIN METHOD (starting point)
  // Java always runs this first
  // ============================================

  public static void main(String[] args) {

    System.out.println("=============================");
    System.out.println("   LOGIN TEST SUITE v2.0     ");
    System.out.println("=============================");
    System.out.println("");

    // TEST 1 — valid login — we EXPECT success = true
    checkLogin("precious@gmail.com", "correct123", "TEST 1 - Valid login", true);

    // TEST 2 — wrong password — we EXPECT success = false
    checkLogin("precious@gmail.com", "wrongpass", "TEST 2 - Wrong password", false);

    // TEST 3 — empty username
    checkEmptyField("", "Username", "TEST 3 - Empty username");

    // TEST 4 — empty password
    checkEmptyField("", "Password", "TEST 4 - Empty password");

    // TEST 5 — password too short
    checkPasswordLength("abc", 8, "TEST 5 - Password too short");

    System.out.println("");
    System.out.println("=============================");
    System.out.println("   ALL TESTS COMPLETE        ");
    System.out.println("=============================");
  }
}