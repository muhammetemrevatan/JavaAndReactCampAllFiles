package core;

import entities.concretes.User;

public interface EmailCheckService {
	boolean emailCheck(User user);
}
