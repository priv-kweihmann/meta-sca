SRC_URI += "https://proxy.golang.org/github.com/jackc/pgservicefile/@v/v0.0.0-20200714003250-2b9c44734f2b.zip;srcoutput=github.com/jackc/pgservicefile;srcinput=github.com/jackc/pgservicefile@v0.0.0-20200714003250-2b9c44734f2b;downloadfilename=github-com-jackc-pgservicefile-0.0.0-20200714003250-2b9c44734f2b.zip;name=github-com-jackc-pgservicefile"
SRC_URI[github-com-jackc-pgservicefile.sha256sum] = "8422a25b9d2b0be05c66ee1ccfdbaab144ce98f1ac678bc647064c560d4cd6e2"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/jackc/pgservicefile/LICENSE;md5=209ee38a480b3726bf58105857868aa4 \
"

GOSRC_INCLUDEGUARD += "github.com-jackc-pgservicefile-sources.inc"

