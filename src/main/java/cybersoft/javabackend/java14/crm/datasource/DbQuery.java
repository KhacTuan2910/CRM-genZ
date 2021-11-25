package cybersoft.javabackend.java14.crm.datasource;

public class DbQuery {
	/* USER */
	public static final String USER_WITH_ROLE = "SELECT u.id as user_id, u.name as user_name, email, password, phone, address, r.id as role_id, r.name as role_name, r.description as role_description FROM crm_user u LEFT JOIN crm_role r ON  u.role_id = r.id";
	public static final String USER_UPDATE ="UPDATE crm_user SET name = ?, email = ?, phone = ?, address = ?, role_id = ? WHERE id = ?";
	public static final String GET_ONE_USER = "SELECT u.id as user_id, u.name as user_name, email, password, phone, address, r.id as role_id, r.name as role_name, r.description as role_description FROM crm_user u LEFT JOIN crm_role r ON  u.role_id = r.id WHERE u.id = ?";
	public static final String USER_REMOVE ="DELETE FROM crm_user WHERE id = ?";
	public static final String USER_ADD = "INSERT crm_user(name, email, password, phone, address, role_id) VALUES (?, ?, ?, ?, ?, ?)";
	
	/* PROJECT */
	public static final String PROJECT_WITH_USER = "SELECT id, name, description, start_date, end_date, user_id FROM crm_project";
	public static final String PROJECT_UPDATE = "UPDATE crm_project SET name = ?, description = ?, start_date = ?, end_date = ? WHERE id = ?";
	public static final String PROJECT_ADD = "INSERT INTO crm_project(name, description, start_date, end_date, user_id) VALUES (?, ?, ?, ?, ?)";
	public static final String PROJECT_REMOVE = "DELETE FROM crm_project WHERE id = ?";
	
	
	
}
