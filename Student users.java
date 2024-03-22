import java.util.*;
class Staff
{
public static void main(String[] args)
{
 int total_users, staff_users,non_teachingstaffs,student_users;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the total users");
total_users=sc.nextInt();
System.out.println("enter the staff users");
staff_users=sc.nextInt();
non_teachingstaffs=staff_users/3;
student_users=total_users-(staff_users+non_teachingstaffs);
System.out.println("student users : "+student_users);
}
}
