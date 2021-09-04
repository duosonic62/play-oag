# play Open API Generator Sample

## generate code

```
$ docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i ./openapi.yaml \
    -g scala-play-server \
    -o /local/out \
    --additional-properties basePackage=com.example
```