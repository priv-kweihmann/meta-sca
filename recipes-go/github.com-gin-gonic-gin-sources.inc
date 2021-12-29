SRC_URI += "https://proxy.golang.org/github.com/gin-gonic/gin/@v/v1.7.7.zip;srcoutput=github.com/gin-gonic/gin;srcinput=github.com/gin-gonic/gin@v1.7.7;downloadfilename=github-com-gin-gonic-gin-1.7.7.zip;name=github-com-gin-gonic-gin"
SRC_URI[github-com-gin-gonic-gin.sha256sum] = "a8230849a93afdcf2ffd651b54310a39b8b78280dc293c21472dae888a6b6925"

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
