SRC_URI += "https://proxy.golang.org/github.com/spf13/jwalterweatherman/@v/v1.1.0.zip;srcoutput=github.com/spf13/jwalterweatherman;srcinput=github.com/spf13/jwalterweatherman@v1.1.0;downloadfilename=github-com-spf13-jwalterweatherman-1.1.0.zip;name=github-com-spf13-jwalterweatherman"
SRC_URI[github-com-spf13-jwalterweatherman.sha256sum] = "43cc5f056caf66dc8225dca36637bfc18509521b103a69ca76fbc2b6519194a3"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/spf13/jwalterweatherman/LICENSE;md5=67fac7567cbf6ba946e5576d590b1ed4 \
"

GOSRC_INCLUDEGUARD += "github.com-spf13-jwalterweatherman-sources.inc"

