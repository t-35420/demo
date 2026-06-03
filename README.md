# demo

## 本地端啟動專案

1. **建立環境變數檔**：
    ```bash
    cp .env.example .env
    ```

2. **配置環境變數**：開啟 `.env` 修改為本地端的設定。
   ```env
   MYSQL_ROOT_PASSWORD=your_password
   MYSQL_DATABASE=demo_db
   ```

3. **啟動 Docker 服務**：
   ```bash
   docker compose up -d
   ```

4. **確認啟動成功**：
   ```bash
   docker compose ps
   ```

5. **啟動 Spring Boot**：

- 已安裝 Maven：
   ```bash
   mvn spring-boot:run
   ```
- 使用 Maven Wrapper：
     ```bash
     ./mvnw spring-boot:run
     ```

6. **資料庫初始化**：
   
   第一次啟動專案時：
   ```text
   1. Docker 會建立 MySQL 容器。
   2. MySQL 會建立 .env 中設定的資料庫。
   3. Spring Boot 會根據 JPA Entity 建立或更新資料表。
   ```

7. **停止 Docker 服務**：

- 停止並移除容器：
   ```bash
   docker compose down
   ```
- 停止服務並清空所有資料：
   ```bash
   docker compose down -v
   ```