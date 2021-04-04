SRC_URI += "https://proxy.golang.org/github.com/spf13/cast/@v/v1.3.1.zip;srcoutput=github.com/spf13/cast;srcinput=github.com/spf13/cast@v1.3.1;downloadfilename=github-com-spf13-cast-1.3.1.zip;name=github-com-spf13-cast"
SRC_URI[github-com-spf13-cast.sha256sum] = "9431fba3679d68cb98976c0f87e20520555835ecf772182991a37831426f219e"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/spf13/cast/LICENSE;md5=67fac7567cbf6ba946e5576d590b1ed4 \
"

GOSRC_INCLUDEGUARD += "github.com-spf13-cast-sources.inc"

