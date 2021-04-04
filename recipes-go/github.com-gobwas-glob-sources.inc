SRC_URI += "https://proxy.golang.org/github.com/gobwas/glob/@v/v0.2.3.zip;srcoutput=github.com/gobwas/glob;srcinput=github.com/gobwas/glob@v0.2.3;downloadfilename=github-com-gobwas-glob-0.2.3.zip;name=github-com-gobwas-glob"
SRC_URI[github-com-gobwas-glob.sha256sum] = "0cfe486cd63d45ed4cb5863ff1cbd14b15e4b9380dcbf80ff26991b4049f4fdf"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobwas/glob/LICENSE;md5=0945febef83436030e30c73ea9980b42 \
"

GOSRC_INCLUDEGUARD += "github.com-gobwas-glob-sources.inc"

