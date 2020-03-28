SUMMARY = "A toolkit with common assertions and mocks that plays nicely with the standard library"
HOMEPAGE = "https://github.com/stretchr/testify"

SRC_URI = "\
    git://github.com/stretchr/testify.git;protocol=https;tag=v${PV};name=testify;destsuffix=git/src/github.com/stretchr/testify \
    git://github.com/stretchr/objx.git;protocol=https;tag=v0.1.0;name=objx;destsuffix=git/src/github.com/stretchr/objx \
    "

S = "${WORKDIR}/git"

GO_IMPORT = "github.com/stretchr"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/testify/LICENSE;md5=d4c9e9b2abd3afaebed1524a9a77b937 \
                     file://src/${GO_IMPORT}/objx/LICENSE;md5=d023fd31d3ca39ec61eec65a91732735 \
                     "

DEPENDS += "\
            github.com-davecgh-go-spew-native \
            github.com-pmezard-go-difflib-native \
            gopkg.in-yaml.v2-native \
            "

PROVIDES += "github.com-stretchr-testify-native"
PROVIDES += "github.com-stretchr-objx-native"

inherit go
inherit native
