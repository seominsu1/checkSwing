import org.springframework.data.jpa.repository.JpaRepository;
import vo.Member.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Long> {

    List<Member> findByUsername(String name);
}
