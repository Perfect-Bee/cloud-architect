# IP : 13.125.233.16


# 예산 제한
<details>
<sumarry>  </sumarry>
<img width="1280" height="627" alt="Lv 0 예산제한(복붙용)" src="https://github.com/user-attachments/assets/229d94f0-a88f-4dc1-ab1e-80904af3a375" />

</details>

# Lv.1 
<details>
  <sumarry> 열기/닫기 </sumarry>

## 1-1. 인프라 구축

<img width="2066" height="327" alt="image" src="https://github.com/user-attachments/assets/3f7f939b-0906-40c4-abe5-cdff3e0e0a48" />

## 1-2. 어플리케이션 개발
### 맴버 생성 및 조회

<img width="1415" height="565" alt="image" src="https://github.com/user-attachments/assets/d4ebb754-a053-4dde-991b-78ef9d7963c8" />

<img width="1426" height="746" alt="image" src="https://github.com/user-attachments/assets/d5e7ac35-5810-4165-b616-e678eaf1f734" />


### 운영 설정(propertices -> 공통, local, prod) 
- application -> application / application-local / application-prod

## 배포 및 검증

<img width="1427" height="790" alt="image" src="https://github.com/user-attachments/assets/0993ff00-ced6-4b73-a30c-febadfdbf26a" />

</details>

# Lv.2
## 인프라 요구사항
### RDS

<img width="1197" height="1018" alt="image" src="https://github.com/user-attachments/assets/ca28c70c-9ec3-441f-a7f9-bba59bf7e294" />

### 보안그룹체이닝

<img width="2169" height="425" alt="image" src="https://github.com/user-attachments/assets/2ef4242a-f3b3-4883-b7fb-2b1dd2ff12e4" />

### 파라미터

<img width="2476" height="402" alt="image" src="https://github.com/user-attachments/assets/d86567c2-2694-4f8b-b432-3a5edf31f464" />


## 파라미터 -> RDS
### 파라미터 -> RDS 값을 /actuator/info 에서 확인
조건!
- **과제 제출 요구사항**
    1. **Actuator Info 엔드포인트 URL**
        - `/actuator/info`에 접속했을 때, Parameter Store에 저장했던 또는 확인용 파라미터 값이 JSON으로 출력되는 URL을 README.md에 작성하세요
        - *(예: `http://3.34.xx.xx:8080/actuator/info`)*
    2. **RDS 보안 그룹 스크린샷**
        - AWS 콘솔 > RDS > 보안 그룹 > **[인바운드 규칙]** 탭을 캡처하세요.
        - 소스(Source) 부분에 IP 주소(`0.0.0.0/0`)가 아닌, EC2의 보안 그룹 ID (`sg-xxxxx`)가 등록되어 있음을 보여주어야 합니다.
      


# LV.3
## 프로필 사진 기능 : S3
### 인프라

### 
