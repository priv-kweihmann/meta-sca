SRC_URI += "https://proxy.golang.org/github.com/mattn/go-sqlite3/@v/v1.14.10.zip;srcoutput=github.com/mattn/go-sqlite3;srcinput=github.com/mattn/go-sqlite3@v1.14.10;downloadfilename=github-com-mattn-go-sqlite3-1.14.10.zip;name=github-com-mattn-go-sqlite3"
SRC_URI[github-com-mattn-go-sqlite3.sha256sum] = "3c1e6497b023fc4741bf1bbfb39ae657b99cf44cfb33f5cbf1e88b315d25a306"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-sqlite3/LICENSE;md5=2b7590a6661bc1940f50329c495898c6 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-sqlite3-sources.inc"

