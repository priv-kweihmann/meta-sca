SRC_URI += "https://proxy.golang.org/github.com/iancoleman/strcase/@v/v0.2.0.zip;srcoutput=github.com/iancoleman/strcase;srcinput=github.com/iancoleman/strcase@v0.2.0;downloadfilename=github-com-iancoleman-strcase-0.2.0.zip;name=github-com-iancoleman-strcase"
SRC_URI[github-com-iancoleman-strcase.sha256sum] = "cb5027fec91d36426f0978a6c42ab52d8735fa3e1711be0127feda70a9a9fd05"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/iancoleman/strcase/LICENSE;md5=809a7bcb6415543e8f857d969bd45c95 \
"

GOSRC_INCLUDEGUARD += "github.com-iancoleman-strcase-sources.inc"

