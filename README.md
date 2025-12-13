
<h2>3주차: 부트스트랩 기반으로 한 디자인을 개인 포트폴리오로 제작하기.</h2>
<br>
<h3>내용</h3>
프로필 구현<br>
-상단의 네비바를 수정하여 게시판으로 가는 곳로 디자인. <br>
-자신과 관련된 이미지, 전공, 분야 등등으로 프로필 수정. <br>
-하이퍼링크를 통한 맵핑구현 스크립트 구현.<br>
<br>
<img width="1226" height="553" alt="image" src="https://github.com/user-attachments/assets/9393c29a-2552-4f1b-9b02-9349e2dbadd1" />
<br>
3주차 연습문제: 포트폴리오 뒤로가기 추가 완료
<br><br><br>

<h2>4주차: 데이터베이스 연동 및 테스트.</h2>
<br>
<h3>내용</h3>
프로필 추가 수정하기.<br>
-기술 경험의 주요 내용을 한글로 바꾸고, 자신과 관련된 내용으로 바꾼다.<br>
<br>
JPA 연동을 위한 SQL 다운및 데이터베이스 연동<br>
-연동 확인을 위한 테스트 페이즈를 만들어서 체크하기.<br>
<br>

<img width="698" height="548" alt="image" src="https://github.com/user-attachments/assets/92198f4d-d725-4c1f-bc4f-1f4cae9501c0" />
<br>
<img width="736" height="437" alt="image" src="https://github.com/user-attachments/assets/7dfdde6f-7532-4f71-a8f0-2ecbcf559fb1" />
<br>
4주차 연습문제: 사용자 추가 및 출력하기 완료
<br><br><br>


<h2>5주차: 블로그 게시판 제작 1.</h2>
<br>
<h3>내용</h3>
프로필 추가 수정하기.<br>
-포트폴리오 네비바, 게시판 페이지로 맵핑.<br>
-게시판 페이지 생성<br>
<br>
블로그 게시판(조회)<br>
-게시판 페이지 생성<br>
-controller, service, repossitory로 폴더 세분화.<br>
-엔티티 클래스 추가 –Entity: 데이터베이스 구조(테이블) 작성<br>
-리포지토리 클래스 추가 –Repository: 데이터베이스 제어기능 작성<br>
-서비스 클래스 추가 –Service: 게시판 주요기능(로직) 작성<br>
-컨트롤러 클래스 추가 –Controller: 게시판 요청/응답 기능 작성<br>
<br>
블로그 게시판(글쓰기)<br>
-게시판 글쓰기 페이지 생성<br>
-게시글을 저장하는 매핑 추가<br>
-service를 통한 DTO추가.<br>
<br>

<img width="901" height="493" alt="image" src="https://github.com/user-attachments/assets/8628f0ed-62e3-4c90-a665-cf92b6c13e42" />
<br>
<img width="927" height="466" alt="image" src="https://github.com/user-attachments/assets/7a0325a5-904f-46cf-a9a7-6b25b6cb6cbf" />
<br>
5주차 연습문제: 페이지 리다이렉트 완료
<br><br><br>

<h2>6주차: 블로그 게시판 제작 2.</h2>
<br>
<h3>내용</h3>
블로그 게시판(수정)<br>
-게시글 목록 아래 수정, 삭제버튼 추가.<br>
-수정 페이지 추가(article_edit.html)<br>
-컨트롤러 클래스 추가+ 매핑<br>
-서비스 클래스(BlogService.java) 수정, 수정기능(로직) 작성, Optional(널 리턴 방지)<br>
-html과 컨트롤러에 수정 버튼 put매핑 등록, update 호출.<br>
-테이블인 파일(Article.java) 객체(테이블)를 수정하는 update 메소드 추가<br>
-application.properties 설정 변경 spring.mvc.hiddenmethod.filter.enabled=true<br>
<br>
블로그 게시판(삭제)<br>
-컨트롤러 클래스 수정(DELETE 매핑+ html 약간 수정)<br>
-서비스 클래스에 삭제기능 추가<br>
<br>
<img width="1903" height="632" alt="image" src="https://github.com/user-attachments/assets/61180eeb-a3a9-4b23-8eaf-e8dc90d71f52" />
<br>
<img width="902" height="402" alt="image" src="https://github.com/user-attachments/assets/fc6ac6a1-a8dc-402a-894f-b7a0139c6971" />
<br>
6주차 연습문제: 에러페이지 예외처리 완료.
<br><br><br>

<h2>7주차: 블로그 게시판 수정!</h2>
<br>
<h3>내용</h3>

프로필 수정하기<br>
-나의 프로젝트 소스코드 확인 및 수정<br>
-포트폴리오 컨테이너 하위 체크 및 이미지 변경<br>

게시판 수정하기<br>
-article을 활용한 board 게시판 제작 시작.<br>
-프론트 디자인 수정<br>
-기존의 Article DB대신 Board DB를 만들어낸다.(id, 제목, 내용, 이름, 시간, 조회수, 좋아요)<br>
-artice_list를 대체한 board_list에는 id, 제목, 이름, 시간 ,조회수, 좋아요가 들어갈 파라미터를 설정.<br>
-BoardRepository를 만들어서 Board를 지포지토리에 연동시킨다.<br>
-기존의 서비스 안에 든 findall과 findbyid 메소드는 주석 처리 혹은, Board에 맞게 변경.<br> 
-제목을 클릭하면 글의 내용을 볼, board_view.html 생성.<br>
-html에 수정, 삭제버튼 추가 및 기능 구현<br>
<br>
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/547ab242-f4b8-4c17-83d8-481a1c56cdc3" />
<br>
7주차 연습문제: 게시판 페이지 글 수정 추가 완료.
<br><br><br>

<h2>8주차: 없음</h2>
<br>

<h2>9주차: 검색과 페이징</h2>
<br>
<h3>내용</h3>

게시판 수정하기- 글쓰기<br>
-index.html에 게시판 네비바, article_list에서 board_list.html로 링크 변경.<br>
-board_list 글쓰기 버튼 삽입<br>
-board_write.html생성 및 컨트롤러에 매핑<br>
-board_write.html 히든 설정 세팅<br>
-컨트롤러에 /board_write 등록<br>
-저장기능 기존의 save 메소드 약간 수정<br>
<br>
게시판 수정하기-검색창과 페이지<br>
-html에 검색창 추가.<br>
-컨트롤러 수정 /board_list 매핑을 추가 수정, 한 페이지의 게시글 수 제한과 키워드 검색에 대한 글 표시.<br>
-서비스 수정: Board의 findall과 searchByKeyword 기능구현(검색기능)<br>
-html의 하단에 페이징 기능 구현<br>
<br>
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/eea14821-824b-4908-8a43-4d3f16fc9ede" />
<br>
<img width="940" height="337" alt="image" src="https://github.com/user-attachments/assets/73e51371-0cb8-44f7-9579-bd0df53574b8" />
<br>
<img width="1915" height="1077" alt="image" src="https://github.com/user-attachments/assets/fe325398-1da7-436d-a94a-a309369a7ce3" />
<br>
<img width="985" height="330" alt="image" src="https://github.com/user-attachments/assets/ec033bd5-8d76-4230-945b-9fe4ff387c2e" />
<br>
9주차 연습문제: 게시판 페이지 글 수정 및 삭제기능 추가 완료.
<br><br><br>

<h2>10주차: 로그인과 로그아웃</h2>
<br>
<h3>내용</h3>

회원 가입하기<br>
-스프링 시큐리티(의존성 추가), pom.xml 수정<br>
-config 폴더 생성, 안에 보안 설정(필터 체인, 암호화 설정 등)을 처리하기 위한 SecurityConfig.java 생성<br>
-도메인 Member.java(id, 이름, 이메일, 패스워드, 나이, 전화번호, 주소) 생성<br>
-회원 가입을 위한,  MemberController.java을 생성하고 매핑 등록.<br>
-회원 가입 화면 페이지를 작성: Templates 폴더에 join_new.html을 생성.(기본 구조는 board_list.html을 재활용)<br>
-레포지토리에 Member_Repository.java를 생성<br>
-회원 가입 등 서비스 기능을 작성: service 폴더에 Member_Service.java를 생성(기본 구조는 BlogService.java을 재활용과 기본 구조는 이전의 글쓰기 기능과 동일)<br>
-회원 가입 등에필요한 DTO를 작성: Service에 AddMemberRequest.java를 작성. (참고 : 기본 구조는 기존 DTO와 동일)<br>
-회원가입하기 –완료 화면: Templates 폴더에 join_end.html을 생성<br>
<br>
로그인<br>
-Templates 폴더에 login.html을 생성(기본 구조는 board_list.html을 재활용)<br>
-회원 로그인을 위한 맵핑을 등록 : Controller의 MemberContoroller.java를 수정.(로그인페이지와 로그인 체크 2가지 맵핑 추가)<br>
-회원 로그인을 서비스를 등록: Service의 MemberService.java를 수정. (이메일과 패스워드 일치 확인)<br>
<br>

<img width="912" height="570" alt="image" src="https://github.com/user-attachments/assets/eeacf50d-a5c5-45b5-bb14-7664a6be5738" />
<br>
입력값 제한
<br>
<img width="1381" height="812" alt="image" src="https://github.com/user-attachments/assets/dddeea2b-745c-4725-bea8-418bcb86154c" />
<br>오류값(나이, 패스워드) 기입시<br>
<img width="1920" height="1016" alt="image" src="https://github.com/user-attachments/assets/440dc0a8-60e6-4125-9467-6e1ce183432c" />
<br>에러 페이지로 이동<br>
<br>
10주차 연습문제: 입력값 필터링 추가 완료.
<br><br><br> 

<h2>11주차: 로그인과 로그아웃</h2>
<br>
<h3>내용</h3>

프로필 수정하기<br>
-나의 팀원 소스코드 확인. 내용 한글로, 그림 및 역할 입력<br>
-연락하기 버튼을 수정. 하이퍼 링크(href)에 다양한 연결 가능<br>
-그림 및 설명을 한글로 수정. (추천인/전문가 후기로 변경)<br>
<br>
로그인<br>
-로그인 체크 기능을 추가, Controller의 BlogController.java를 수정, 기존 게시판 맵핑(board_list)을 확인.<br>
-로그인 과정에 세션을 생성, Controller 폴더에 MemberController.java를 수정, 기존 로그인 검증 맵핑(api/login_check)을 확인<br>
-로그인 후, "게시판에 사용자 환영합니다." 출력, Controller 폴더에 MemberController.java를 수정, 세션 아이디 아래 email을 세션으로 추가 설정<br>
-게시판에 사용자 이메일 출력, 로그 아웃 버튼도 추가<br>
-단일 사용자만 로그인 처리: Controller 폴더에 MemberController.java를 수정.(세션이 이미 존재하면 초기화한다)<br>
-로그 아웃 버튼을 구현: Controller 폴더에 MemberController.java를 수정.<br>
-게시판 화면에 맵핑 로그아웃(api/logout)을 구현.<br>
-세션에 관련된 보안 기능을 추가: Config 폴더에 SecurityConfig.java를 수정.<br>
-세션에 관련된 보안 기능을 추가. 최상위 폴더에 application.properties를 수정.(로딩 시점과 우선 순위 확인)<br>
-300초 = 5분, 쿠키 https 전송 활성화<br>
<br>

<img width="1426" height="472" alt="image" src="https://github.com/user-attachments/assets/a5a8f0dd-3b7e-4dab-bd7e-746df0ab480c" /><br>
글쓰기 완료시, 유저 이름으로 표시하기 완료.<br>
<img width="1446" height="528" alt="image" src="https://github.com/user-attachments/assets/6e36a7c5-fec2-424a-8447-eb562429663a" /><br>
타인의 게시글 수정, 삭제 불가능한 화면<br>
<img width="1450" height="590" alt="image" src="https://github.com/user-attachments/assets/d1a1082f-9d01-452d-b35c-e292b2dc60a5" /><br>
자신의 게시글 수정, 삭제 화면 가능 화면<br>
<br>
11주차 연습문제: 게시판 수정하기 완료.
<br><br><br> 

<h2>12주차: 로그인과 로그아웃</h2>
<br>
<h3>내용</h3>

프로필 수정하기(개인 최종)<br>
-프로필 최하단 소스코드 확인: Templates의 index.html을 수정, 주소및 연락처 등 한글로 수정.<br>
-메일 업로드 기능으로 수정: Templates의 index.html을 수정, 기존 최하단 연락하기 소스를 확인.<br>
-메일 업로드를 위한 컨트롤러를 추가: Controller 폴더에 FileController.java를 추가, 파일 업로드를 위한 post 매핑을 구현<br>
-메일 업로드 완료 화면을 작성: Templates 폴더에 upload_end.html을 생성<br>
<br>

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/aa0fd5a0-cc66-4563-967f-8b3c31834e78" /><br>
2개 이상 로그인 세션처리 완료.<br>
<img width="953" height="492" alt="image" src="https://github.com/user-attachments/assets/45dfa6df-dd90-4beb-b9cd-ce4e9ff05973" /><br>
<img width="666" height="131" alt="image" src="https://github.com/user-attachments/assets/df1b7adb-8bb3-45a7-85aa-0eb3a2c828bf" /><br>
파일 업로드 시, 시간에 따라서 다르게 파일명 생성.<br>
<br>
12주차 연습문제: 세션 처리, 파일 업로드 완료.




