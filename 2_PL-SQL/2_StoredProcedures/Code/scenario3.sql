CREATE OR REPLACE PROCEDURE TransferFunds(
    from_account_id IN NUMBER,
    to_account_id IN NUMBER,
    amount IN NUMBER
) AS
    balance NUMBER;
BEGIN
    SELECT Balance INTO balance FROM Accounts WHERE AccountID = from_account_id;
    
    IF balance >= amount THEN
        UPDATE Accounts SET Balance = Balance - amount WHERE AccountID = from_account_id;
        UPDATE Accounts SET Balance = Balance + amount WHERE AccountID = to_account_id;
        COMMIT;
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient balance in source account.');
    END IF;
END;
/
