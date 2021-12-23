SUMMARY = "NPM: word-wrap"
DESCRIPTION = "Wrap words to a specified length."
HOMEPAGE = "https://github.com/jonschlinkert/word-wrap"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c8f80ed52c9074414e8a69541cdc1587"

SRC_URI = "https://registry.npmjs.org/word-wrap/-/word-wrap-1.2.3.tgz"
SRC_URI[md5sum] = "48773dbe44ca6aae3bc6b49e7cecddfe"
SRC_URI[sha256sum] = "64fbda023432cc8dc32b15d6be6a30d024ee07f16a32b2405209ba4a9f1dfcd9"

NPM_PKGNAME = "word-wrap"

inherit npmhelper
inherit native
