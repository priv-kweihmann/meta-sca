SUMMARY = "NPM: textextensions"
DESCRIPTION = "A package that contains an array of every single file extension there is for text files"
HOMEPAGE = "https://github.com/bevry/textextensions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=10f8378cf9409df9bd8015af40a24b59"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/textextensions/-/textextensions-3.3.0.tgz"
SRC_URI[md5sum] = "5da438a44e8a6bf4086c0cc64a92a091"
SRC_URI[sha256sum] = "8d2f74fec32b5b1b0112cf2a84ec181cab3c6b19195715bf812ee623085ab04c"

NPM_PKGNAME = "textextensions"

inherit npmhelper
inherit native
