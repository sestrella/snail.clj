FROM clojure:lein-2.5.0

RUN useradd -m sestrella
USER sestrella

WORKDIR /home/sestrella
