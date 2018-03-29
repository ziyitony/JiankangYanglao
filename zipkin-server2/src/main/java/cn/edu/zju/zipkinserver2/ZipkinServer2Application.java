package cn.edu.zju.zipkinserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServer2Application.class, args);
	}
}
