Sample java client acting as a publisher leveraging RabbitMQ server. This sample project is built using TDD (Test Driven Development) approach (though the test cases are fake as of now).

Clone the project
=================
	git clone https://github.com/2kchakka/sample-amqp-java-publisher.git {project_dir}

How to build
============
Build using Apache Maven. The command is:<br/>

	cd {project_dir}
	mvn clean install

How to run
==========
Run as a standalone java program. The command is:<br/>

	cd {project_dir}
	java -jar target/amqp-publisher-0.0.1-SNAPSHOT-jar-with-dependencies.jar (for linux)
                                   OR
	java -jar target\amqp-publisher-0.0.1-SNAPSHOT-jar-with-dependencies.jar (for windows)


 
