SRC_URI += "https://proxy.golang.org/github.com/gomodule/redigo/@v/v1.8.4.zip;srcoutput=github.com/gomodule/redigo;srcinput=github.com/gomodule/redigo@v1.8.4;downloadfilename=github-com-gomodule-redigo-1.8.4.zip;name=github-com-gomodule-redigo"
SRC_URI[github-com-gomodule-redigo.sha256sum] = "880ca30d3c7065d093133b46f92d9c4550dfe25e5be9df57205ae9fa95e48faf"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gomodule/redigo/LICENSE;md5=2ee41112a44fe7014dce33e26468ba93 \
"

GOSRC_INCLUDEGUARD += "github.com-gomodule-redigo-sources.inc"

