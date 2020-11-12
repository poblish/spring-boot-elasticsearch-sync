# Spring Boot > JPA > Hibernate Search > Elasticsearch

Start: `docker-compose up -d`

Save entity: `http localhost:8080/demo/`

Check DB with: `docker-compose exec mysql mysql --user=admin --password=password dev`

Sample Elasticsearch queries:

    http localhost:9200/person-000001/_count
    http localhost:9200/person-000001/_mappings
    http localhost:9200/person-000001/_source/1
    http localhost:9200/person-000001/_search '{"query":{"term":{"forename":"Andrew"}}}'
