# module


## module 이란?

Java9 이전까지 흔히 이야기 하는 캡슐화를 위한 범위는 간단하게 package와 class 그리고 class 내부의 private, public, protected가 전부였다.
Java9부터 추가된 module은 여러개의 패키지를 한번더 캡슐화 하여 package에 대한 접근권한을 부여하고 해당 module에서 외부에 노출할 패키지를 정의할 수 있게 되었다.


## 소스코드 실행하는 법

프로젝트 루트 경로에서 실행한다. 

- hello 모듈 컴파일
```sh
javac -d mods/world --module-path ./mods/ ./src/etc/module/world/libs/World.java ./src/etc/module/world/module-info.java
```

- world 모듈 컴파일
```sh
javac -d mods/hello --module-path ./mods/ ./src/etc/module/hello/main/Hello.java ./src/etc/module/hello/module-info.java
```

- 실행 
```
java --module-path mods -m hello/etc.module.hello.main.Hello
```
## 커멘드 라인 옵션
 Java 9 모듈 시스템에 대한 지원이 Maven과 Gradle에 추가되었으므로, 사실 프로젝트를 수동으로 빌드할 일은 없을 것이다. 그러나 전체 시스템이 어떻게 동작하는지 정확히 이해하기 위해서, 커멘드 라인 옵션에 대한 이해는 필요하다.
 1) --module-path : --module-path 옵션을 사용하여 모듈 경로를 지정합니다. 모듈이 포함된 하나 이상의 디렉터리 목록이다.
 2) --add-reads : 모듈 설명자 파일(module-info.java)에 의존하지 않고, 커멘드 라인을 통해 'requires'와 동일한 역할을 할 수 있다. : -add-reads
 3) --add-exports : 모듈 설명자 파일(module-info.java)에 의존하지 않고, 커멘드 라인을 통해 'exports'와 동일한 역할을 할 수 있다.
 4) --add-opens : 모듈 설명자 파일(module-info.java)에 'open' 절을 대체한다.
 5) --add-modules : 디폴트 모듈 집합에 모듈 목록을 추가한다.
 6) --list-modules : 모든 모듈 및 해당 버전 문자열 목록을 보여준다.
 7) --patch-module : 모듈을 추가하거나 오버라이드 한다.
 8) --illegal-access=permit|warn|deny : 하나의 글로벌 경고문만을 보여주거나(permit) 혹은 모든 경고문을 보여주면서(warn) 강력한 캡슐화(리플랙션에 대한 제한)를 완화시킬 수 있다. deny의 경우 illegal-access에 대해 에러를 발생시킨다. 디폴트는 permit이다.

## 주의사항

- VSCode 상에서는 module-info.java 파일에 빨간줄이 나타날 것이다. (IDE에서 미지원하는 것 같음)
- 개인적으로 Spring Modulith를 사용하는 것이 더 편하다고 생각됨