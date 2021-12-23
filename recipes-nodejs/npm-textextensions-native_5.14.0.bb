SUMMARY = "NPM: textextensions"
DESCRIPTION = "A package that contains an array of every single file extension there is for text files"
HOMEPAGE = "https://github.com/bevry/textextensions"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=ed191a4651d2d9d2f46b4e22c98fc801"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/textextensions/-/textextensions-5.14.0.tgz"
SRC_URI[md5sum] = "90d25b30bb571b88e5658c70ee693142"
SRC_URI[sha256sum] = "21eaf7103b93f74339c01b3b2e8837b23a0d017dee806ae0bd4c84bc3ece7b55"

NPM_PKGNAME = "textextensions"

inherit npmhelper
inherit native
