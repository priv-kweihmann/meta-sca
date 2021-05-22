SRC_URI += "https://proxy.golang.org/github.com/gin-gonic/gin/@v/v1.7.2.zip;srcoutput=github.com/gin-gonic/gin;srcinput=github.com/gin-gonic/gin@v1.7.2;downloadfilename=github-com-gin-gonic-gin-1.7.2.zip;name=github-com-gin-gonic-gin"
SRC_URI[github-com-gin-gonic-gin.sha256sum] = "eb9af06e5be18b958ee92e8a47bf2f971ef2b3f4f31cc54b64e834aa4605c71c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gin-gonic/gin/LICENSE;md5=2e674b99ec94fcbd735f85c03ab8d74f \
"

GOSRC_INCLUDEGUARD += "github.com-gin-gonic-gin-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gin-contrib-sse-sources.inc', '', 'github.com-gin-contrib-sse-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-go-playground-validator-v10-sources.inc', '', 'github.com-go-playground-validator-v10-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-protobuf-sources.inc', '', 'github.com-golang-protobuf-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-json-iterator-go-sources.inc', '', 'github.com-json-iterator-go-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-isatty-sources.inc', '', 'github.com-mattn-go-isatty-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-stretchr-testify-sources.inc', '', 'github.com-stretchr-testify-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-ugorji-go-codec-sources.inc', '', 'github.com-ugorji-go-codec-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'gopkg.in-yaml.v2-sources.inc', '', 'gopkg.in-yaml.v2-sources.inc', d)}
