SUMMARY = "common assertions and mocks library"
DESCRIPTION = "A toolkit with common assertions and mocks that plays nicely with the standard library"
HOMEPAGE = "https://github.com/stretchr/testify"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
                    file://src/${GO_IMPORT}/testify/LICENSE;md5=d4c9e9b2abd3afaebed1524a9a77b937 \
                    file://src/${GO_IMPORT}/objx/LICENSE;md5=d023fd31d3ca39ec61eec65a91732735 \
                   "

DEPENDS += "\
            github.com-davecgh-go-spew-native \
            github.com-pmezard-go-difflib-native \
            gopkg.in-yaml.v2-native \
            "

PROVIDES += "github.com-stretchr-testify-native"
PROVIDES += "github.com-stretchr-objx-native"

SRC_URI = "\
           git://github.com/stretchr/testify.git;protocol=https;name=testify;destsuffix=git/src/github.com/stretchr/testify \
           git://github.com/stretchr/objx.git;protocol=https;name=objx;destsuffix=git/src/github.com/stretchr/objx \
          "
SRCREV_testify = "3ebf1ddaeb260c4b1ae502a01c7844fa8c1fa0e9"
SRCREV_objx = "ea4fe68685ee0d3cee7032121851b57e7494e8ea"

S = "${WORKDIR}/git"

GO_IMPORT = "github.com/stretchr"

inherit go
inherit native
