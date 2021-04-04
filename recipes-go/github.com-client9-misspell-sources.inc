SRC_URI += "https://proxy.golang.org/github.com/client9/misspell/@v/v0.3.4.zip;srcoutput=github.com/client9/misspell;srcinput=github.com/client9/misspell@v0.3.4;downloadfilename=github-com-client9-misspell-0.3.4.zip;name=github-com-client9-misspell"
SRC_URI[github-com-client9-misspell.sha256sum] = "a3af206372e131dd10a68ac470c66a1b18eaf51c6afacb55b2e2a06e39b90728"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/client9/misspell/LICENSE;md5=387f6b7d6741c8a7f4f7e3c2bbdf97e4 \
"

GOSRC_INCLUDEGUARD += "github.com-client9-misspell-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-gobwas-glob-sources.inc', '', 'github.com-gobwas-glob-sources.inc', d)}
