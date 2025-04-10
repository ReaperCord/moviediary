CREATE TABLE movie (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    release_date DATE,
    rating numeric,
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);