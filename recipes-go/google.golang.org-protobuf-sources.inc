SRC_URI_append = " https://proxy.golang.org/google.golang.org/protobuf/@v/v1.26.0.zip;srcoutput=google.golang.org/protobuf;srcinput=google.golang.org/protobuf@v1.26.0;downloadfilename=google-golang-org-protobuf-1.26.0.zip;name=google-golang-org-protobuf"
SRC_URI[google-golang-org-protobuf.sha256sum] = "d7bc5de329bd4e803f7a2acfcbe8f2eba4ef1579485056ef569a4b245bee1208"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/google.golang.org/protobuf/LICENSE;md5=02d4002e9171d41a8fad93aa7faf3956 \
"
