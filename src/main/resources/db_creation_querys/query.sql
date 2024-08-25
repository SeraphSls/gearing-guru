
CREATE TABLE users(
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(10) NOT NULL
);


CREATE TABLE vehicles(
    id SERIAL PRIMARY KEY,
    model VARCHAR(100) NOT NULL,
    brand VARCHAR(100) NOT NULL,
    users_id bigint unsigned NOT NULL,
    FOREIGN KEY (users_id) REFERENCES users(id) ON DELETE CASCADE
);


CREATE TABLE calculations(
id SERIAL PRIMARY KEY,
gear_ratio DECIMAL(5,2) NOT NULL,
differential_ratio DECIMAL(5,2) NOT NULL,
tire_size DECIMAL(5,2) NOT NULL,
torque DECIMAL(10,2) NOT NULL,
speed DECIMAL(5,2) NOT NULL,
horsepower DECIMAL(10,2) NOT NULL,
vehicles_id bigint unsigned NOT NULL,
FOREIGN KEY (vehicles_id) REFERENCES vehicles(id) ON DELETE CASCADE
);