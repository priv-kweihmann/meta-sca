SRC_URI += "https://proxy.golang.org/github.com/hhatto/gorst/@v/v0.0.0-20181029133204-ca9f730cac5b.zip;srcoutput=github.com/hhatto/gorst;srcinput=github.com/hhatto/gorst@v0.0.0-20181029133204-ca9f730cac5b;downloadfilename=github-com-hhatto-gorst-0.0.0-20181029133204-ca9f730cac5b.zip;name=github-com-hhatto-gorst"
SRC_URI[github-com-hhatto-gorst.sha256sum] = "c920b7ad2f7e3cd99f9c8c49163192b1b9bd178190764998f01d3084199fc3f1"

GOSRC_LICENSE += "\
    BSD-3-Clause \
    GPL-1.0-or-later \
    GPL-2.0-or-later \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/hhatto/gorst/LICENSE;md5=b604ce05d093b9e6d4aeba7c6c9d36cf \
"

GOSRC_INCLUDEGUARD += "github.com-hhatto-gorst-sources.inc"

