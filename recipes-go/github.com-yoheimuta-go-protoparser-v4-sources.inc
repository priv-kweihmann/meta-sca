SRC_URI += "https://proxy.golang.org/github.com/yoheimuta/go-protoparser/v4/@v/v4.5.4.zip;srcoutput=github.com/yoheimuta/go-protoparser/v4;srcinput=github.com/yoheimuta/go-protoparser/v4@v4.5.4;downloadfilename=github-com-yoheimuta-go-protoparser-v4-4.5.4.zip;name=github-com-yoheimuta-go-protoparser-v4"
SRC_URI[github-com-yoheimuta-go-protoparser-v4.sha256sum] = "f12c80b1ebd1be704c4f0d7fc554631828ae24af3a6fc58fba3c29533046840b"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yoheimuta/go-protoparser/v4/LICENSE.md;md5=30ad73e30b326f9e84681acc60c1fe80 \
"

GOSRC_INCLUDEGUARD += "github.com-yoheimuta-go-protoparser-v4-sources.inc"

