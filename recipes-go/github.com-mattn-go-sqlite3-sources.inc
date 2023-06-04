SRC_URI += "https://proxy.golang.org/github.com/mattn/go-sqlite3/@v/v1.14.17.zip;srcoutput=github.com/mattn/go-sqlite3;srcinput=github.com/mattn/go-sqlite3@v1.14.17;downloadfilename=github-com-mattn-go-sqlite3-1.14.17.zip;name=github-com-mattn-go-sqlite3"
SRC_URI[github-com-mattn-go-sqlite3.sha256sum] = "66a42aef50b6e1714738aad050c71e254444f8ca854ad3e0597e5d2a91f0150d"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-sqlite3/LICENSE;md5=2b7590a6661bc1940f50329c495898c6 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-sqlite3-sources.inc"

