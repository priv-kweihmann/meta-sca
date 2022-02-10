SRC_URI += "https://proxy.golang.org/github.com/yoheimuta/go-protoparser/v4/@v/v4.5.2.zip;srcoutput=github.com/yoheimuta/go-protoparser/v4;srcinput=github.com/yoheimuta/go-protoparser/v4@v4.5.2;downloadfilename=github-com-yoheimuta-go-protoparser-v4-4.5.2.zip;name=github-com-yoheimuta-go-protoparser-v4"
SRC_URI[github-com-yoheimuta-go-protoparser-v4.sha256sum] = "5f72b53716897d96518c559c7ee31ecb71be89df46955a4d7d544f6c9e2a328d"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/yoheimuta/go-protoparser/v4/LICENSE.md;md5=30ad73e30b326f9e84681acc60c1fe80 \
"

GOSRC_INCLUDEGUARD += "github.com-yoheimuta-go-protoparser-v4-sources.inc"

