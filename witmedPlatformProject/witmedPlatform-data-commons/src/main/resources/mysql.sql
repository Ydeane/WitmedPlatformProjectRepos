select column_name,data_type,column_comment from information_schema.columns where TABLE_SCHEMA = 'witmedplatform_db' and TABLE_NAME = 'sys_admin' order by data_type asc