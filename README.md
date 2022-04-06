# Spring Boot, MyBatis 프로그램 과제

  DemoApplication 파일을 실행하면 서버가 실행됩니다.
  그 때에 schema.sql을 통해 테이블이 생성됩니다.
  
  이 데이터의 DTO는 TestData 파일에 저장되어있습니다.
  
  H2 데이터베이스를 사용했습니다.
  
  index.html 화면에서 주소록 데이터 입력할 수 있게 되어있습니다.
  
  저장 버튼을 누르면 TestContoller를 통해서 insertData 페이지에 매핑되고,
  TestService, TestServiceImpl를 통해서 TestMapper의 insertData 쿼리르 실행하게 됩니다.
  
  H2 데이터베이스 관련 정보는 application.properties 에 저장되어있습니다.
