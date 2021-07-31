SRC_URI += "https://proxy.golang.org/github.com/spf13/cast/@v/v1.4.0.zip;srcoutput=github.com/spf13/cast;srcinput=github.com/spf13/cast@v1.4.0;downloadfilename=github-com-spf13-cast-1.4.0.zip;name=github-com-spf13-cast"
SRC_URI[github-com-spf13-cast.sha256sum] = "18434f5c6150263a08804003ef0f5ea21574ff0b17729a370a866bfa4e917c34"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/spf13/cast/LICENSE;md5=67fac7567cbf6ba946e5576d590b1ed4 \
"

GOSRC_INCLUDEGUARD += "github.com-spf13-cast-sources.inc"

