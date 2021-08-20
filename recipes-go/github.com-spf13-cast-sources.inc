SRC_URI += "https://proxy.golang.org/github.com/spf13/cast/@v/v1.4.1.zip;srcoutput=github.com/spf13/cast;srcinput=github.com/spf13/cast@v1.4.1;downloadfilename=github-com-spf13-cast-1.4.1.zip;name=github-com-spf13-cast"
SRC_URI[github-com-spf13-cast.sha256sum] = "40d870421317c16b07a7fe1b7ce74b17ed62c13aa7446892d137c7969aa47eda"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/spf13/cast/LICENSE;md5=67fac7567cbf6ba946e5576d590b1ed4 \
"

GOSRC_INCLUDEGUARD += "github.com-spf13-cast-sources.inc"

