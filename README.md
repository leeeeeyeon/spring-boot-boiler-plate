# 💡프로젝트 환경
> Spring Boot 3.1.5 <br>
> Java 17 <br>
> JUnit5

# 💡개발 환경 설정
> 개발 환경은 MySQL, 테스트 환경은 H2 를 사용할 것 <br>
> 개발 환경은 Docker를 통해 구성할 것
- [ ] DB 환경 설정
- [ ] AOP를 통한 로깅

# 💡API Response
- [x] 공통 Response 객체 생성
- [x] 공통 Exception 처리

### Success Response
```json
{
  "code": "S000",
  "message": "OK",
  "data": {
    "id": 1,
    "name": "test"
  }
}
```

### Error Response
```json
{
  "code": "ER000",
  "message": "에러 발생 원인에 대해 작성하기"
}
```

# 💡 인증/인가
>  HTTP 통신을 위해 Feign Client를 사용할 것 <br>
> JWT와 Redis로 회원 정보를 관리할 것

### 기능
- [ ] 회원가입
- [ ] 로그인
- [ ] 로그아웃
- [ ] 회원탈퇴

### 방식
- [ ] 아이디, 비밀번호
- [ ] OAuth
  - [ ] Google 

# 💡CI
- [ ] Github Actions 스크립트 작성

# 💡테스트 코드
- [ ] jacoco 연동
- [ ] Github Actions 스크립트 작성: PR이 올라오면 커버리지를 분석하여 Comment로 남긴다

# 💡DB 형상 관리
- [ ] Flyway 연동

# 💡API 명세
- [ ] Spring Rest Docs
