# play Open API Generator Sample

## generate code

```
$ docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i /local/openapi.yaml \
    -g scala-play-server \
    -o /local/out \
    --additional-properties basePackage=com.example,apiPackage=com.example.api,modelPackage=com.example.model
```