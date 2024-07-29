package anafontanari.bootcamp_santander_2024.domain.repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    boolean existsByAccountNumber(String number);

    boolean existsByCardNumber(String number);
}

