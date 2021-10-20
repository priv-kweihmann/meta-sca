SRC_URI += "https://proxy.golang.org/github.com/mattn/go-sqlite3/@v/v1.14.9.zip;srcoutput=github.com/mattn/go-sqlite3;srcinput=github.com/mattn/go-sqlite3@v1.14.9;downloadfilename=github-com-mattn-go-sqlite3-1.14.9.zip;name=github-com-mattn-go-sqlite3"
SRC_URI[github-com-mattn-go-sqlite3.sha256sum] = "793658c6d4a91c12abdebe2d51af41480173ac2be16934e14fbf51177c678c6e"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/mattn/go-sqlite3/LICENSE;md5=2b7590a6661bc1940f50329c495898c6 \
"

GOSRC_INCLUDEGUARD += "github.com-mattn-go-sqlite3-sources.inc"

