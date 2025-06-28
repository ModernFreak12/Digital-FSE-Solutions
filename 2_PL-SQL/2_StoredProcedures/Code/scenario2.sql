CREATE PROCEDURE UpdateEmployeeBonus(
    dept IN VARCHAR2,
    percent IN NUMBER
) AS
BEGIN
    UPDATE Employees SET Salary = Salary + (Salary * (percent / 100)) WHERE Department = dept;
    COMMIT;
END;
