SUMMARY = "NPM: check-ends-with-period"
DESCRIPTION = "Check the text is ends with period mark."
HOMEPAGE = "https://github.com/azu/check-ends-with-period"

DEPENDS = "npm-array.prototype.find-native npm-emoji-regex-native npm-end-with-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

SRC_URI = "https://registry.npmjs.org/check-ends-with-period/-/check-ends-with-period-1.0.1.tgz"
SRC_URI[md5sum] = "e69e0b315a58a9b20e56c07d141539ee"
SRC_URI[sha256sum] = "a789b1012b6632ff24c6ae85bd083ffcceb6f11394ce3a7d05d647ee2b72120b"

NPM_PKGNAME = "check-ends-with-period"

inherit npmhelper
inherit native
