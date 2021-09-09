# play Open API Generator Sample

## generate code
コード生成方法

```
$ docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i /local/openapi.yaml \
    -g scala-play-server \
    -o /local/out \
    --additional-properties basePackage=com.example,apiPackage=com.example.api,modelPackage=com.example.model
```

## generated models
生成されたモデルはそのまま利用可能  
ただし、バリデーションは自前で実装しなくてはならない

```scala
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2021-09-07T08:41:25.199689Z[Etc/UTC]")
case class BookRegistrationParameter(
  name: String,
  author: String,
  isbn: BigDecimal
)

object BookRegistrationParameter {
  // ここを変更しないとバリデーションはかからない
  implicit lazy val bookRegistrationParameterJsonFormat: Format[BookRegistrationParameter] = Json.format[BookRegistrationParameter]
}
```

[JSON Reads/Writes/Format Combinators - Validation with Reads](https://www.playframework.com/documentation/2.8.x/ScalaJsonCombinators#Validation-with-Reads)

## generated API Controller
コントローラーは自動生成されるのでそのまま利用可能。  
コントローラーではリクエストからJSONを読み込んだり、戻り値のインスタンスからレスポンスのJSONを生成したりしてくれる。  
--additional-propertiesでsupportAsyncをtrueにしておくと Futureでやりとりしてくれる。  

コントローラーからXXXAPI(trait)に渡されて、実際の処理はXXXAPIを実装したXXXAPIImplで行われる。
XXXAPIImplは雛形だけ自動で生成されるので、ここ以降の処理を実装していくことになる。

## generated config files
ルーティングやDIに関しても自動生成したファイルを使うことができる。
一応application.confも自動生成されるが、他の設定も書いていくことになると思うのであまり使えなさそう。

## まとめ
バリデーションかかればとても使えれば完璧だと思うが、バリデーションが入っていない。
Modelに手を入れるのは正直微妙だが、そこさえ手を入れてしまえば統一感のあるコードを作成できそう。
このAPIを使う側のコードも自動生成できるので、そこまで考慮に入れれば割と良い。