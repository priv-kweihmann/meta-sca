SRC_URI_append = " https://proxy.golang.org/github.com/grpc-ecosystem/go-grpc-middleware/@v/v1.2.2.zip;srcoutput=github.com/grpc-ecosystem/go-grpc-middleware;srcinput=github.com/grpc-ecosystem/go-grpc-middleware@v1.2.2;downloadfilename=github-com-grpc-ecosystem-go-grpc-middleware-1.2.2.zip;name=github-com-grpc-ecosystem-go-grpc-middleware"
SRC_URI[github-com-grpc-ecosystem-go-grpc-middleware.sha256sum] = "c785f2d1102a813db34466b1f4fdca5555fc89cd56e787a2b934269da897d999"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/grpc-ecosystem/go-grpc-middleware/LICENSE;md5=7ab5c73bb7e4679b16dd7c11b3559acf \
"
