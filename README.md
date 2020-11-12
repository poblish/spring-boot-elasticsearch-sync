# Spring Boot > JPA > Hibernate Search > Elasticsearch

Save a Kotlin JPA `@Entity` marked up with Hibernate Search annotations like `@Indexed`, and have the changes seamlessly indexed and made searchable in an Elasticsearch 7.x cluster.

---

Start: `docker-compose up -d`

Save entity: `http localhost:8080/demo/`

Check DB with: `docker-compose exec mysql mysql --user=admin --password=password dev`

Sample Elasticsearch queries:

    http localhost:9200/person-000001/_count
    http localhost:9200/person-000001/_mappings
    http localhost:9200/person-000001/_source/1
    http localhost:9200/person-000001/_search '{"query":{"term":{"forename":"Andrew"}}}'

**References:**

https://docs.jboss.org/hibernate/search/6.0/reference/en-US/html_single/
https://docs.jboss.org/hibernate/search/6.0/reference/en-US/html_single/#backend-elasticsearch
https://www.elastic.co/guide/en/elasticsearch/reference/7.10/index.html