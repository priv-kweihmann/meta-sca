SRC_URI_append = " https://proxy.golang.org/github.com/jhump/protoreflect/@v/v1.8.2.zip;srcoutput=github.com/jhump/protoreflect;srcinput=github.com/jhump/protoreflect@v1.8.2;downloadfilename=github-com-jhump-protoreflect-1.8.2.zip;name=github-com-jhump-protoreflect"
SRC_URI[github-com-jhump-protoreflect.sha256sum] = "f5ca8dffb5dd11bdc4af743de0548bc7cffd27452580ded23a7b3200d5ee32a0"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/jhump/protoreflect/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
"
