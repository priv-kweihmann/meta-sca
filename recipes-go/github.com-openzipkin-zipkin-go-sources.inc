SRC_URI_append = " https://proxy.golang.org/github.com/openzipkin/zipkin-go/@v/v0.2.5.zip;srcoutput=github.com/openzipkin/zipkin-go;srcinput=github.com/openzipkin/zipkin-go@v0.2.5;downloadfilename=github-com-openzipkin-zipkin-go-0.2.5.zip;name=github-com-openzipkin-zipkin-go"
SRC_URI[github-com-openzipkin-zipkin-go.sha256sum] = "337535c088bd6f7a479e21747044286f66490871948989d52f7812bc4cca955e"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/openzipkin/zipkin-go/LICENSE;md5=aa0e5d6d95d878dca816abf94da09587 \
"
