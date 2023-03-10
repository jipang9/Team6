package middleProjects.com.board.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import middleProjects.com.member.entity.Member;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class BoardRecommendation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;

    public BoardRecommendation(Board board, Member member) {
        this.member = member;
        this.board = board;
    }
}
