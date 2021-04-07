SRC_URI += "https://proxy.golang.org/github.com/xo/terminfo/@v/v0.0.0-20210125001918-ca9a967f8778.zip;srcoutput=github.com/xo/terminfo;srcinput=github.com/xo/terminfo@v0.0.0-20210125001918-ca9a967f8778;downloadfilename=github-com-xo-terminfo-0.0.0-20210125001918-ca9a967f8778.zip;name=github-com-xo-terminfo"
SRC_URI[github-com-xo-terminfo.sha256sum] = "95df9027154da15095209d1b4cd75cd749bf622aead9354d9258c4cf365715ec"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/xo/terminfo/LICENSE;md5=61f81b062030209a0f311e1266386524 \
"

GOSRC_INCLUDEGUARD += "github.com-xo-terminfo-sources.inc"

