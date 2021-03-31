SRC_URI_append = " https://proxy.golang.org/github.com/opentracing/opentracing-go/@v/v1.2.0.zip;srcoutput=github.com/opentracing/opentracing-go;srcinput=github.com/opentracing/opentracing-go@v1.2.0;downloadfilename=github-com-opentracing-opentracing-go-1.2.0.zip;name=github-com-opentracing-opentracing-go"
SRC_URI[github-com-opentracing-opentracing-go.sha256sum] = "9b1a75e9a454a0cf01a26c18e48cd321e3b300943ac5adb9098ba033dbd40db5"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/opentracing/opentracing-go/LICENSE;md5=f4e91fcd9abdeb3c904b834127d5cb20 \
"
