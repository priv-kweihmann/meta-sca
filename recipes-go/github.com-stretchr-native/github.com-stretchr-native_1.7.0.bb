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
SRCREV_testify = "acba37e5db06f0093b465a7d47822bf13644b66c"
SRCREV_objx = "35313a95ee26395aa17d366c71a2ccf788fa69b6"

S = "${WORKDIR}/git"

GO_IMPORT = "github.com/stretchr"

inherit go
inherit native
