SRC_URI += "https://proxy.golang.org/github.com/spf13/cast/@v/v1.5.0.zip;srcoutput=github.com/spf13/cast;srcinput=github.com/spf13/cast@v1.5.0;downloadfilename=github-com-spf13-cast-1.5.0.zip;name=github-com-spf13-cast"
SRC_URI[github-com-spf13-cast.sha256sum] = "0d6f70dc849ce1e56f2b50ceeac0a7eec9dd2b8414b556ad183a35cc5c84342a"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/spf13/cast/LICENSE;md5=67fac7567cbf6ba946e5576d590b1ed4 \
"

GOSRC_INCLUDEGUARD += "github.com-spf13-cast-sources.inc"

