SUMMARY = "NPM: textextensions"
DESCRIPTION = "A package that contains an array of every single file extension there is for text files"
HOMEPAGE = "https://github.com/bevry/textextensions"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=ed191a4651d2d9d2f46b4e22c98fc801"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/textextensions/-/textextensions-5.15.0.tgz"
SRC_URI[md5sum] = "b44d487940c3fbf0c073b019ed6f895b"
SRC_URI[sha256sum] = "6dda42be87e86cb05d8264b18f6ff067036db154538604010934e13f9eec2ad7"

NPM_PKGNAME = "textextensions"

inherit npmhelper
inherit native
