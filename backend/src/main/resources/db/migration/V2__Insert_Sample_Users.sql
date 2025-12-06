INSERT INTO users (email, password, created_at) VALUES
    ('testuser1@gmail.com', 'pasword_1', NOW()),
    ('testuser2@gmail.com', 'password_2', NOW());

COMMENT ON TABLE users IS 'Table storing user information.';