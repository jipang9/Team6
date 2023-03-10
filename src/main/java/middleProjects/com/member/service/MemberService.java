package middleProjects.com.member.service;

import middleProjects.com.board.dto.BoardResponseDto;
import middleProjects.com.member.dto.info.ResponseDto;
import middleProjects.com.member.dto.login.LoginRegisterDto;
import middleProjects.com.member.dto.register.RegisterRequestDto;
import middleProjects.com.member.dto.register.RegisterResponseDto;
import middleProjects.com.member.entity.Member;

import java.util.List;

public interface MemberService {

    void register(RegisterRequestDto registerRequestDto); // 회원가입

    RegisterResponseDto login(LoginRegisterDto loginRegisterDto); // 사용자 로그인

    void checkByMemberPassword(LoginRegisterDto loginRegisterDto, Member member); // 사용자 비밀번호 확인

    void checkByMemberDuplicated(String username); // 사용자 중복 체크

    // 고민 1) 어떤 데이터를 던져서 확인하는 것이 좋을까? 단순하게 이렇게 id값을 던지는게 맞나? 아니면 username이 전달되어야 하나?
    ResponseDto memberInfo(Long id); // 사용자 정보 확인

    void checkByMemberNickName(String nickName); // 사용자 닉네임 체크

    List<BoardResponseDto> getMyBoard(String username); // 사용자 정보로 board 정보 가지고오기


}
