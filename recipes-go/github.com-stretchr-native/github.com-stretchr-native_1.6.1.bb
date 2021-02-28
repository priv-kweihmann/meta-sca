SUMMARY = "common assertions and mocks library"
DESCRIPTION = "A toolkit with common assertions and mocks that plays nicely with the standard library"
HOMEPAGE = "https://github.com/stretchr/testify"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
                    file://src/${GO_IMPORT}/testify/LICENSE;md5=188f01994659f3c0d310612333d2a26f \
                    file://src/${GO_IMPORT}/objx/LICENSE;md5=d023fd31d3ca39ec61eec65a91732735 \
                   "

DEPENDS += "\
            github.com-davecgh-go-spew-native \
            github.com-pmezard-go-difflib-native \
            gopkg.in-yaml.v3-native \
            "

PROVIDES += "github.com-stretchr-testify-native"
PROVIDES += "github.com-stretchr-objx-native"

SRC_URI = "\
           git://github.com/stretchr/testify.git;protocol=https;name=testify;destsuffix=git/src/github.com/stretchr/testify \
           git://github.com/stretchr/objx.git;protocol=https;name=objx;destsuffix=git/src/github.com/stretchr/objx \
          "
SRCREV_testify = "f654a9112bbeac49ca2cd45bfbe11533c4666cf8"
SRCREV_objx = "ea4fe68685ee0d3cee7032121851b57e7494e8ea"

S = "${WORKDIR}/git"

GO_IMPORT = "github.com/stretchr"

export GO111MODULE = "auto"

inherit go
inherit native
