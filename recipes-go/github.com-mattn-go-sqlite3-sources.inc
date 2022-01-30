SRC_URI += "https://proxy.golang.org/github.com/mattn/go-sqlite3/@v/v1.14.11.zip;srcoutput=github.com/mattn/go-sqlite3;srcinput=github.com/mattn/go-sqlite3@v1.14.11;downloadfilename=github-com-mattn-go-sqlite3-1.14.11.zip;name=github-com-mattn-go-sqlite3"
SRC_URI[github-com-mattn-go-sqlite3.sha256sum] = "6339de97670ec8c809e38b1425be2ea53590da62a09ee7d39ffc945bb0394c34"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-sqlite3/LICENSE;md5=2b7590a6661bc1940f50329c495898c6 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-sqlite3-sources.inc"

