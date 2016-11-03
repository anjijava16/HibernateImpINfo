HQL :  We remeber one point All Operations having own classes 

Query query=session.createQuery("Query"); // Here HQL Operation started 

HQL Operation query must be pojo class level not like plain SQL query


List list=query.list() /// select Operation

int x=query.executeUpdate(); // Non Select operation

==========================================================================

Creteria :: 

Criteria crit=session.createCritiria(Employee.class); Here i am loading total employee details

select * from Employee where empStatus='ACTIVE' and empName like '%s%' and empSal>=15000
Criterion criterion = Restrictions.ilike("mail", "%s%"); // Putting Condtion's
		crit.add(criterion);
		List<Employee> list = crit.list();
		for (Employee emp : list) {
			System.out.println(emp.getFname() + "  " + emp.getNo());
		}

public BugDTO restultPage(String searchName){
Criteria crit=session.createCritiria(Employee.class); Here i am loading total employee details
Criterion criterion = Restrictions.ilike("sumarry", "%searchName%"); // Putting Condtion's
Criterion criterion = Restrictions.eq("mail", "abc"); // Putting Condtion's

select * from TBL_Name where mailId in('abc@gmail.com','abcd@gmail.com','jju@gmail.com');
Object obj[]=new Object[]{'abc@gmail.com','abcd@gmail.com','jju@gmail.com'};
Criterion criterion = Restrictions.in("mailId",obj); // Putting Condtion's

select * from TBLName where mail='abc'
}

Full object loading 


YOu want perform some ordering in Criteria level we need to use Predefined classes 



i)Projection I
ii)Projections.C
iii)ProjectionList I
EMP (mail,no,firstname,lastname) 4 Coulumns

select this_.EID as EID2_0_, this_.FIRSTNAME as FIRSTNAME2_0_, this_.LASTNAME as LASTNAME2_0_, this_.EMAIL as EMAIL2_0_ from EmployeeHb_ONE this_ where this_.EID in (?, ?, ?, ?, ?, ?, ?)
Projection proj1=Projections.property("mail");
Projection proj2=Projections.property("firstname");
ProjectionList pList=Projections.projectionList();
		pList.add(proj1);
		pList.add(proj2);
pList={"mail","firstname"};
		crit.setProjection(pList);
Only 2 columns

NativeSQL ::

I) Select as well as Non Select Operation

pure JDBC Query's or database depedent query's

select sysdate from dual;
select current_date()


SQLQuery query=session.createSQLQuery("select * from   EmployeeHb_ONE");


List list=query.list();
Iterator it=list.iterator();
while(it.hasNext()){

Object obj[]=(Object[])it.next();
Employee emp=(Employee)obj;

}

		

























