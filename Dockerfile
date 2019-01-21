FROM clojure:openjdk-11-tools-deps

RUN mkdir /app

WORKDIR /app

RUN wget https://raw.githubusercontent.com/vishnubob/wait-for-it/master/wait-for-it.sh
RUN chmod 777 wait-for-it.sh