SRC_URI += "https://proxy.golang.org/github.com/yoheimuta/go-protoparser/v4/@v/v4.5.3.zip;srcoutput=github.com/yoheimuta/go-protoparser/v4;srcinput=github.com/yoheimuta/go-protoparser/v4@v4.5.3;downloadfilename=github-com-yoheimuta-go-protoparser-v4-4.5.3.zip;name=github-com-yoheimuta-go-protoparser-v4"
SRC_URI[github-com-yoheimuta-go-protoparser-v4.sha256sum] = "a0d7588e42d142be4d61d68dbcbd8197b6a3004b2fc894ef953a2ae38bfa862d"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yoheimuta/go-protoparser/v4/LICENSE.md;md5=30ad73e30b326f9e84681acc60c1fe80 \
"

GOSRC_INCLUDEGUARD += "github.com-yoheimuta-go-protoparser-v4-sources.inc"

