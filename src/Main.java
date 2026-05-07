void main() {

  // Test 1 - Valid login
  String username = "precious@gmail.com";
  String password = "correct123";

  if (username.equals("precious@gmail.com") && password.equals("correct123")) {
    System.out.println("TEST 1 PASSED - Login successful");
  } else {
    System.out.println("TEST 1 FAILED - Login failed");
  }

  // Test 2 - Wrong password
  String wrongPassword = "wrongpass";

  if (wrongPassword.equals("correct123")) {
    System.out.println("TEST 2 FAILED - Should have rejected wrong password");
  } else {
    System.out.println("TEST 2 PASSED - Wrong password correctly rejected");
  }

  // Test 3 - Empty username
  String emptyUsername = "";

  if (emptyUsername.isEmpty()) {
    System.out.println("TEST 3 PASSED - Empty username correctly detected");
  } else {
    System.out.println("TEST 3 FAILED - Empty username was not caught");
  }
}