SRC_URI += "https://proxy.golang.org/github.com/mattn/go-sqlite3/@v/v1.14.12.zip;srcoutput=github.com/mattn/go-sqlite3;srcinput=github.com/mattn/go-sqlite3@v1.14.12;downloadfilename=github-com-mattn-go-sqlite3-1.14.12.zip;name=github-com-mattn-go-sqlite3"
SRC_URI[github-com-mattn-go-sqlite3.sha256sum] = "2264d7f537e966df8f2c9554ccf0599fe6295638be61f74cf8e7e563ec6f905c"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-sqlite3/LICENSE;md5=2b7590a6661bc1940f50329c495898c6 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-sqlite3-sources.inc"

