SRC_URI += "https://proxy.golang.org/github.com/jolestar/go-commons-pool/@v/v1.1.2.zip;srcoutput=github.com/jolestar/go-commons-pool;srcinput=github.com/jolestar/go-commons-pool@v1.1.2;downloadfilename=github-com-jolestar-go-commons-pool-1.1.2.zip;name=github-com-jolestar-go-commons-pool"
SRC_URI[github-com-jolestar-go-commons-pool.sha256sum] = "302963b0b6eede6d2d7f3828e3be4daf4c35703738ea9f726b2340791060a1b1"

GOSRC_LICENSE += "\
    Apache-2.0 \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jolestar/go-commons-pool/LICENSE;md5=fa818a259cbed7ce8bc2a22d35a464fc \
"

GOSRC_INCLUDEGUARD += "github.com-jolestar-go-commons-pool-sources.inc"

