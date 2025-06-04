ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE id = ?");
stmt.setString(1, userId);