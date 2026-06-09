# commerce-cloud-lab

Kotlin과 Spring Cloud를 기반으로 이커머스 도메인을 구현하며, TDD와 DDD 아키텍처를 함께 학습하는 실험형 프로젝트입니다.

이 프로젝트는 단순히 Kotlin 기본 문법만 연습하는 저장소가 아니라, 실제 백엔드 서비스에서 자주 등장하는 회원, 상품, 주문, 결제, 배송 도메인을 중심으로 마이크로서비스 아키텍처, 이벤트 기반 통신, 분산 트랜잭션, 캐시, 테스트 자동화까지 단계적으로 학습하는 것을 목표로 합니다.

## Goals

- Kotlin 기본 문법과 JVM 백엔드 개발 방식 학습
- Spring Boot 기반 REST API 개발
- DDD 스타일의 도메인 모델링 연습
- TDD 방식의 단위 테스트와 통합 테스트 작성
- Spring Cloud 기반 MSA 구성 학습
- Kafka를 활용한 이벤트 기반 아키텍처 구현
- SAGA 패턴을 통한 분산 트랜잭션 흐름 이해
- Redis를 활용한 캐싱 전략 실습
- PostgreSQL, MySQL을 함께 사용하는 이종 데이터베이스 구조 실험
- Kotlin Coroutines와 비동기/논블로킹 처리 방식 학습
- Testcontainers를 활용한 실제 인프라 기반 통합 테스트 구성

## Tech Stack

| Category | Technology |
|---|---|
| Language | Kotlin |
| JDK | Java 21 |
| Framework | Spring Boot 3.4.x |
| Cloud | Spring Cloud 2024.0.x |
| Build | Gradle Kotlin DSL |
| Test | JUnit 5, Kotest, MockK, Testcontainers |
| Database | PostgreSQL, MySQL |
| Cache | Redis |
| Message Broker | Apache Kafka |
| Architecture | DDD, MSA, Event-Driven Architecture, SAGA |
| Async | Kotlin Coroutines, WebClient |

## Modules

```text
commerce-cloud-lab
├── member-service       # 회원 도메인
├── product-service      # 상품 도메인
├── order-service        # 주문 도메인
├── payment-service      # 결제 도메인
├── delivery-service     # 배송 도메인
├── gateway-service      # API Gateway
├── config-service       # 중앙 설정 관리
├── discovery-service    # 서비스 디스커버리
└── common               # 공통 모듈