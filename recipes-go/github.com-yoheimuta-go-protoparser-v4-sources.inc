SRC_URI += "https://proxy.golang.org/github.com/yoheimuta/go-protoparser/v4/@v/v4.4.0.zip;srcoutput=github.com/yoheimuta/go-protoparser/v4;srcinput=github.com/yoheimuta/go-protoparser/v4@v4.4.0;downloadfilename=github-com-yoheimuta-go-protoparser-v4-4.4.0.zip;name=github-com-yoheimuta-go-protoparser-v4"
SRC_URI[github-com-yoheimuta-go-protoparser-v4.sha256sum] = "7742839efd88b9c3b9e539c7e26875131d7c91bf7870ff71ee7ed304c6e3fd77"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yoheimuta/go-protoparser/v4/LICENSE.md;md5=30ad73e30b326f9e84681acc60c1fe80 \
"

GOSRC_INCLUDEGUARD += "github.com-yoheimuta-go-protoparser-v4-sources.inc"

