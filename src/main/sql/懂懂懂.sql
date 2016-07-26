-- 基础:
SELECT * from t_employer LIMIT 4;

SELECT * from t_employer where salary BETWEEN 8000 and 12000;

SELECT * from t_employer_info where (age >= 30 AND sex = '1') or (age <= 28 and sex = '0') ORDER BY sex;

SELECT * FROM t_employer where user_id in (SELECT id from t_employer_info where sex = '0');

SELECT DISTINCT address from t_employer_info;

SELECT max(age) from t_employer_info;
SELECT min(salary) from t_employer;
SELECT min(salary*months) from t_employer;

SELECT count(1) from t_employer_info where sex = '1';

SELECT * from t_employer_info where user_name like '%蛋1%';

SELECT * from t_employer_info where user_name like '汪蛋%';

SELECT * from t_employer_info where user_name like '%蛋4';

SELECT NOW();


-- 进阶:
-- 1. 
SELECT * from t_employer where department_id in (SELECT id from t_department where dname = '研发部' or dname = '销售部'); -- 搜不出来部门名称
		
SELECT e.user_name,salary,months,d.dname from t_employer e
JOIN t_department d ON e.department_id = d.id
WHERE d.dname in ('研发部','销售部');

-- 2. 
SELECT count(1),sex from t_employer_info GROUP BY sex;
SELECT count(1),department_id from t_employer GROUP BY department_id;
SELECT count(1),department_id from t_employer GROUP BY department_id HAVING COUNT(1) > 6;

-- 3.
SELECT * from t_department d
LEFT JOIN (SELECT count(1),department_id from t_employer GROUP BY department_id HAVING COUNT(1) > 6) e on d.id = e.department_id;

SELECT d.*,e.* from (SELECT count(1),department_id from t_employer GROUP BY department_id HAVING COUNT(1) > 6) e
LEFT JOIN t_department d on e.department_id = d.id;
