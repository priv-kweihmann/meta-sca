SRC_URI += "https://proxy.golang.org/github.com/spf13/cast/@v/v1.5.1.zip;srcoutput=github.com/spf13/cast;srcinput=github.com/spf13/cast@v1.5.1;downloadfilename=github-com-spf13-cast-1.5.1.zip;name=github-com-spf13-cast"
SRC_URI[github-com-spf13-cast.sha256sum] = "15f13bcba5bcfe815edcc71baccecd2ac202f55e2817a48676972ea9502833d8"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/spf13/cast/LICENSE;md5=67fac7567cbf6ba946e5576d590b1ed4 \
"

GOSRC_INCLUDEGUARD += "github.com-spf13-cast-sources.inc"

