FROM maven:3.8.6-openjdk-11-slim AS build

# Configurar o diretório de trabalho
WORKDIR /app

# Copiar o arquivo pom.xml e baixar dependências
COPY pom.xml .
RUN mvn dependency:resolve

# Copiar os arquivos do projeto e construir
COPY . .
RUN mvn clean install

# Adicionar o comando para listar os arquivos gerados
RUN ls -l target

# Definir o comando de execução do contêiner
CMD ["java", "-jar", "target/frota-gestao-1.0-SNAPSHOT.jar"]

FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/frota-gestao-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]



