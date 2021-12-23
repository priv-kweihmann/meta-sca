SUMMARY = "NPM: binaryextensions"
DESCRIPTION = "A package that contains an array of every single file extension there is for binary files"
HOMEPAGE = "https://github.com/bevry/binaryextensions"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=ed191a4651d2d9d2f46b4e22c98fc801"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/binaryextensions/-/binaryextensions-4.18.0.tgz"
SRC_URI[md5sum] = "1374d9ebeb8b24b2cdac1973732b33c2"
SRC_URI[sha256sum] = "a70745d749dad0ed88f9c8eef1c2dbd5f3c623fcb9ea20f6607b073d806981eb"

NPM_PKGNAME = "binaryextensions"

inherit npmhelper
inherit native
