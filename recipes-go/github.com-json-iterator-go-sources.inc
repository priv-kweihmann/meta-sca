SRC_URI_append = " https://proxy.golang.org/github.com/json-iterator/go/@v/v1.1.10.zip;srcoutput=github.com/json-iterator/go;srcinput=github.com/json-iterator/go@v1.1.10;downloadfilename=github-com-json-iterator-go-1.1.10.zip;name=github-com-json-iterator-go"
SRC_URI[github-com-json-iterator-go.sha256sum] = "2311e83151f13b90ca153a613af5feaf4ffa8618abda33cd58719cebd1dc5bb7"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/json-iterator/go/LICENSE;md5=0b69744b481d72d30dbf69f84a451cfd \
"
