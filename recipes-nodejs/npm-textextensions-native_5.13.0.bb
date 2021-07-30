SUMMARY = "NPM: textextensions"
DESCRIPTION = "A package that contains an array of every single file extension there is for text files"
HOMEPAGE = "https://github.com/bevry/textextensions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=ed191a4651d2d9d2f46b4e22c98fc801"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/textextensions/-/textextensions-5.13.0.tgz"
SRC_URI[md5sum] = "37db021c1941c31dfa528923dc78009f"
SRC_URI[sha256sum] = "1678c62c6005d5c5973adaa02093485f9b43b6bd71b6b56504d65548950b6afc"

NPM_PKGNAME = "textextensions"

inherit npmhelper
inherit native
