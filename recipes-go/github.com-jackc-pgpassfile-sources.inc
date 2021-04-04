SRC_URI += "https://proxy.golang.org/github.com/jackc/pgpassfile/@v/v1.0.0.zip;srcoutput=github.com/jackc/pgpassfile;srcinput=github.com/jackc/pgpassfile@v1.0.0;downloadfilename=github-com-jackc-pgpassfile-1.0.0.zip;name=github-com-jackc-pgpassfile"
SRC_URI[github-com-jackc-pgpassfile.sha256sum] = "1cc79fb0b80f54b568afd3f4648dd1c349f746ad7c379df8d7f9e0eb1cac938b"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jackc/pgpassfile/LICENSE;md5=ea2961e52eec5b1203f8147a49ef985f \
"

GOSRC_INCLUDEGUARD += "github.com-jackc-pgpassfile-sources.inc"

