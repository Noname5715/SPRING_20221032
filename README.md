
<h2>3주차: 부트스트랩 기반으로 한 디자인을 개인 포트폴리오로 제작하기.</h2>
<br>
<h3>내용</h3>
상단의 네비바를 수정하여 게시판으로 가는 곳로 디자인. <br>
자신과 관련된 이미지, 전공, 분야 등등으로 프로필 채워놓기. <br>
하이퍼링크를 통한 맵핑구현 스크립트.<br>
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


