FROM openjdk:11
WORKDIR /app
COPY SumOfDigits.java /app/
RUN javac SumOfDigits.java
CMD ["java", "SumOfDigits"]