SRC_URI += "https://proxy.golang.org/github.com/mattn/go-sqlite3/@v/v1.14.7.zip;srcoutput=github.com/mattn/go-sqlite3;srcinput=github.com/mattn/go-sqlite3@v1.14.7;downloadfilename=github-com-mattn-go-sqlite3-1.14.7.zip;name=github-com-mattn-go-sqlite3"
SRC_URI[github-com-mattn-go-sqlite3.sha256sum] = "a9f2747143111f83717b83c17e345732862b04cc74d6f4bac7a3a3ac522502e2"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-sqlite3/LICENSE;md5=2b7590a6661bc1940f50329c495898c6 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-sqlite3-sources.inc"

