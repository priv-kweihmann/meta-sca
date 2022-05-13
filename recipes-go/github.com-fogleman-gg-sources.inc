SRC_URI += "https://proxy.golang.org/github.com/fogleman/gg/@v/v1.3.0.zip;srcoutput=github.com/fogleman/gg;srcinput=github.com/fogleman/gg@v1.3.0;downloadfilename=github-com-fogleman-gg-1.3.0.zip;name=github-com-fogleman-gg"
SRC_URI[github-com-fogleman-gg.sha256sum] = "792f7a3ea9eea31b7947dabaf9d5a307389245069078e4bf435d76cb0505439c"
GOSRC_REMOVEDIRS += "github.com/fogleman/gg/examples"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/fogleman/gg/LICENSE.md;md5=1630f0e1bac38694fdc4dcb6a9218f4a \
"

GOSRC_INCLUDEGUARD += "github.com-fogleman-gg-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-golang-freetype-sources.inc', '', 'github.com-golang-freetype-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-image-sources.inc', '', 'golang.org-x-image-sources.inc', d)}
