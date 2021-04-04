SRC_URI += "https://proxy.golang.org/github.com/mattn/go-sqlite3/@v/v1.14.6.zip;srcoutput=github.com/mattn/go-sqlite3;srcinput=github.com/mattn/go-sqlite3@v1.14.6;downloadfilename=github-com-mattn-go-sqlite3-1.14.6.zip;name=github-com-mattn-go-sqlite3"
SRC_URI[github-com-mattn-go-sqlite3.sha256sum] = "703e6cca7d67a5a886fab6c5f837e922e71566b215651c069f13ee137b2964b3"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-sqlite3/LICENSE;md5=2b7590a6661bc1940f50329c495898c6 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-sqlite3-sources.inc"

