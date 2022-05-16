SRC_URI += "https://proxy.golang.org/github.com/mattn/go-sqlite3/@v/v1.14.13.zip;srcoutput=github.com/mattn/go-sqlite3;srcinput=github.com/mattn/go-sqlite3@v1.14.13;downloadfilename=github-com-mattn-go-sqlite3-1.14.13.zip;name=github-com-mattn-go-sqlite3"
SRC_URI[github-com-mattn-go-sqlite3.sha256sum] = "73f893e27de531d2291e515a688bef3cd1f4b1edf0f35c1a5ffdeb518a4b5f89"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-sqlite3/LICENSE;md5=2b7590a6661bc1940f50329c495898c6 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-sqlite3-sources.inc"

