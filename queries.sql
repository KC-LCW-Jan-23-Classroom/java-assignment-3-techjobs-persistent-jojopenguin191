-- Part 1: Test it with SQL

CREATE TABLE job (
     PRIMARY KEY id INTEGER,
    employer varchar(255),
    name varchar(50),
    skills varchar(255)
);

-- Part 2: Test it with SQL

SELECT name
FROM employer
WHERE location = "St. Louis City";

-- Part 3: Test it with SQL

DROP TABLE job;

-- Part 4: Test it with SQL

SELECT *
FROM skill
LEFT JOIN job_skills ON skill.id = job_skills.skills_id ORDER BY name ASC;