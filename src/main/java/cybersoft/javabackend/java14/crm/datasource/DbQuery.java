package cybersoft.javabackend.java14.crm.datasource;

public class DbQuery {
	/* USER */
	public static final String USER_WITH_ROLE = "SELECT u.id as user_id, u.name as user_name, email, password, phone, address, r.id as role_id, r.name as role_name, r.description as role_description FROM crm_user u LEFT JOIN crm_role r ON  u.role_id = r.id";
	public static final String USER_UPDATE ="UPDATE crm_user SET name = ?, email = ?, password = ?, phone = ?, address = ?, role_id = ? WHERE id = ?";
}