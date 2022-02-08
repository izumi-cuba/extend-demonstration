-- begin SEC_USER_SUBSTITUTION
alter table SEC_USER_SUBSTITUTION add column ADDITIONAL varchar(255) ^
alter table SEC_USER_SUBSTITUTION add column DTYPE varchar(31) ^
update SEC_USER_SUBSTITUTION set DTYPE = 'extend_Substitution' where DTYPE is null ^
-- end SEC_USER_SUBSTITUTION
