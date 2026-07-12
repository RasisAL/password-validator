# Password Validator

A simple Java password validator with JUnit black-box and white-box tests.

## Validation Rules

- Password must not be null
- Must be at least 8 characters long
- Must contain at least one uppercase letter
- Must contain at least one lowercase letter

## Project Structure

```
FFinal/
├── PasswordValidator.java
└── PasswordValidatorTest.java
```

## Running the Tests

This project uses JUnit 4 and was developed in Eclipse.

## Test Coverage

**Black-box tests**

- Valid password accepted
- Missing uppercase rejected
- Missing lowercase rejected
- Too short password rejected

**White-box tests**

- Contains both cases (valid)
- Lowercase only (invalid)
- Uppercase only (invalid)
- Null password (invalid)