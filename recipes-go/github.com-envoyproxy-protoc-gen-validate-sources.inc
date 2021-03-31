SRC_URI_append = " https://proxy.golang.org/github.com/envoyproxy/protoc-gen-validate/@v/v0.5.0.zip;srcoutput=github.com/envoyproxy/protoc-gen-validate;srcinput=github.com/envoyproxy/protoc-gen-validate@v0.5.0;downloadfilename=github-com-envoyproxy-protoc-gen-validate-0.5.0.zip;name=github-com-envoyproxy-protoc-gen-validate"
SRC_URI[github-com-envoyproxy-protoc-gen-validate.sha256sum] = "0e45c3b6555ab897738dbfad76b4de3853adb61e5dfe353068f706d8da047212"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/envoyproxy/protoc-gen-validate/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"
