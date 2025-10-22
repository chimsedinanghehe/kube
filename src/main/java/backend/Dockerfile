# Chọn base image
FROM openjdk:24-jdk-slim

# Tạo user không chạy với root
RUN addgroup --system spring && adduser --system spring --ingroup spring
USER spring:spring

# Copy file JAR đã build sẵn vào container
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

# Lệnh khởi động ứng dụng
ENTRYPOINT ["java", "-jar", "/app.jar"]
