SRC_URI_append = " https://proxy.golang.org/github.com/gogo/protobuf/@v/v1.3.2.zip;srcoutput=github.com/gogo/protobuf;srcinput=github.com/gogo/protobuf@v1.3.2;downloadfilename=github-com-gogo-protobuf-1.3.2.zip;name=github-com-gogo-protobuf"
SRC_URI[github-com-gogo-protobuf.sha256sum] = "dd2b73f163c8183941626360196c8f844addd95423d341a0412e1b22d0104ff7"

MOD_LICENSE_append = " \
    BSD-3-Clause \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/gogo/protobuf/LICENSE;md5=38be95f95200434dc208e2ee3dab5081 \
"
