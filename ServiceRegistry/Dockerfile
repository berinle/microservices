FROM java
#COPY src /app/
#COPY build.gradle /app/
#COPY gradle/ /app/
#COPY gradlew /app/
#COPY Dockerfile /app/
COPY . /app/
WORKDIR /app
CMD ["./gradlew", "bootRun"]
