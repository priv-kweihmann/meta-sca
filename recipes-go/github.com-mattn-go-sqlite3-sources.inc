SRC_URI += "https://proxy.golang.org/github.com/mattn/go-sqlite3/@v/v1.14.16.zip;srcoutput=github.com/mattn/go-sqlite3;srcinput=github.com/mattn/go-sqlite3@v1.14.16;downloadfilename=github-com-mattn-go-sqlite3-1.14.16.zip;name=github-com-mattn-go-sqlite3"
SRC_URI[github-com-mattn-go-sqlite3.sha256sum] = "c016e8aa2e777b216f2835f1c788c2f6466bd06c955400ed2144a7737ac82f73"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-sqlite3/LICENSE;md5=2b7590a6661bc1940f50329c495898c6 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-sqlite3-sources.inc"

