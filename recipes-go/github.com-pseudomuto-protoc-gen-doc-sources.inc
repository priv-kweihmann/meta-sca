SRC_URI_append = " https://proxy.golang.org/github.com/pseudomuto/protoc-gen-doc/@v/v1.4.1.zip;srcoutput=github.com/pseudomuto/protoc-gen-doc;srcinput=github.com/pseudomuto/protoc-gen-doc@v1.4.1;downloadfilename=github-com-pseudomuto-protoc-gen-doc-1.4.1.zip;name=github-com-pseudomuto-protoc-gen-doc"
SRC_URI[github-com-pseudomuto-protoc-gen-doc.sha256sum] = "0f5fb7a2ca32fd2945299677bcdef433073edea8c0e2e42bcad593275ae4a5a4"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/pseudomuto/protoc-gen-doc/LICENSE.md;md5=908179eb2e795029a23bf43d1e3e26f1 \
"
