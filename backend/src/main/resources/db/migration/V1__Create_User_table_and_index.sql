CREATE TABLE users (
                          id BIGSERIAL PRIMARY KEY,
                          email VARCHAR(100) NOT NULL UNIQUE,
                          password VARCHAR(100) NOT NULL,
                          created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);
CREATE UNIQUE INDEX idx_unique_email ON users (email);