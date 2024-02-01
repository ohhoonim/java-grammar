package etc.optional;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        // Null이 발생할 수 도 있음을 미리 알려줄 수만 있다면 
        // 받는 쪽에서는 미리 대비할 수 있을 것이다. 
        // 이를 위해 만들어진 것이 Optional type이다.

        // 1. Optional을 사용하지 않았을 때
        var user = UserRepository.findUserById(1L);
        if (user!= null) {  
            System.out.println(user.name);
        } else {
            System.out.println("User not found");
        }

        // 2. Optional을 사용했을 때
        var user2 = UserRepository.findOptionalUserById(1L);
        if (user2.isPresent()) {
            System.out.println(user2.get().name);
        } else {
            System.out.println("User not found");
        }
    }

    record User(Long id, String name, String email) {}

    public class UserRepository {
        public static User findUserById(Long id) {
            if (id == null) {
                return null;
            }
            // return new User(id, name, email);
            return new User(id, "matthew", "some@email");
        }

        public static Optional<User> findOptionalUserById(Long id) {
            if (id == null) {
                return Optional.empty();
            }
            // return new User(id, name, email);
            return Optional.of(new User(id, "matthew", "some@email"));
        }
    }
}
