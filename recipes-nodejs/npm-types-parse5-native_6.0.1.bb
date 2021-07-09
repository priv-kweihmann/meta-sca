SUMMARY = "NPM: @types/parse5"
DESCRIPTION = "TypeScript definitions for parse5"
HOMEPAGE = "https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/parse5"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4a904ca135bb7bc912156fee12726f0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@types/parse5/-/parse5-6.0.1.tgz"
SRC_URI[md5sum] = "960042d1fc952de58bc2951fea4d9fc9"
SRC_URI[sha256sum] = "8a4b5b9141f40ad70b483167b8c4e7bae73a53bebc142209e55130a604f4af89"

NPM_PKGNAME = "@types/parse5"

inherit npmhelper
inherit native

S = "${WORKDIR}/parse5"
