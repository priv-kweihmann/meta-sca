SRC_URI += "https://proxy.golang.org/github.com/yoheimuta/go-protoparser/v4/@v/v4.8.0.zip;srcoutput=github.com/yoheimuta/go-protoparser/v4;srcinput=github.com/yoheimuta/go-protoparser/v4@v4.8.0;downloadfilename=github-com-yoheimuta-go-protoparser-v4-4.8.0.zip;name=github-com-yoheimuta-go-protoparser-v4"
SRC_URI[github-com-yoheimuta-go-protoparser-v4.sha256sum] = "4a9e28852e20d7cb6e179cbefe4f6ffd8f4223eb1c451f2beff1418362ba3d07"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yoheimuta/go-protoparser/v4/LICENSE.md;md5=30ad73e30b326f9e84681acc60c1fe80 \
"

GOSRC_INCLUDEGUARD += "github.com-yoheimuta-go-protoparser-v4-sources.inc"

