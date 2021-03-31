SRC_URI_append = " https://proxy.golang.org/github.com/golang/protobuf/@v/v1.5.2.zip;srcoutput=github.com/golang/protobuf;srcinput=github.com/golang/protobuf@v1.5.2;downloadfilename=github-com-golang-protobuf-1.5.2.zip;name=github-com-golang-protobuf"
SRC_URI[github-com-golang-protobuf.sha256sum] = "5d1c817bebc1202ab3b42a418e584e0008e8027baf212ce69c2ae3e9e7b8c64b"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/golang/protobuf/LICENSE;md5=939cce1ec101726fa754e698ac871622 \
"
