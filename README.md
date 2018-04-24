# Welcome

    service docker restart
    docker pull docker.elastic.co/elasticsearch/elasticsearch:6.1.1
    docker run -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:6.1.1

    curl -u elastic http://127.0.0.1:9200/_cat/health
    elastic
    changeme