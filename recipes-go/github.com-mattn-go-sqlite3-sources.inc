SRC_URI += "https://proxy.golang.org/github.com/mattn/go-sqlite3/@v/v1.14.8.zip;srcoutput=github.com/mattn/go-sqlite3;srcinput=github.com/mattn/go-sqlite3@v1.14.8;downloadfilename=github-com-mattn-go-sqlite3-1.14.8.zip;name=github-com-mattn-go-sqlite3"
SRC_URI[github-com-mattn-go-sqlite3.sha256sum] = "b330046f8fd90e61926ea97363cfdc9d0f7e59fd6860d4132b4605003e14e70d"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-sqlite3/LICENSE;md5=2b7590a6661bc1940f50329c495898c6 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-sqlite3-sources.inc"

