--liquibase formatted sql

--changeset dmichalski:-defseq logicalFilePath:starter/changelog-1.0 runOnChange:true
ALTER TABLE web_user ALTER COLUMN id SET DEFAULT nextval('user_seq');
ALTER TABLE role ALTER COLUMN id SET DEFAULT nextval('role_seq');