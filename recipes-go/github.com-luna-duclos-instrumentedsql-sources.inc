SRC_URI += "https://proxy.golang.org/github.com/luna-duclos/instrumentedsql/@v/v1.1.3.zip;srcoutput=github.com/luna-duclos/instrumentedsql;srcinput=github.com/luna-duclos/instrumentedsql@v1.1.3;downloadfilename=github-com-luna-duclos-instrumentedsql-1.1.3.zip;name=github-com-luna-duclos-instrumentedsql"
SRC_URI[github-com-luna-duclos-instrumentedsql.sha256sum] = "32f0b10c7a6b296a76e14905f05966e4504568fa82af6e01003db6f3e76f37d4"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/luna-duclos/instrumentedsql/LICENSE;md5=4b768d4a3ddf044547846fe135edf6c8 \
"

GOSRC_INCLUDEGUARD += "github.com-luna-duclos-instrumentedsql-sources.inc"

