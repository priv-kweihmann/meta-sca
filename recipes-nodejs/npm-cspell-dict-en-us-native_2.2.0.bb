SUMMARY = "NPM: @cspell/dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_US#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en_us/-/dict-en_us-2.2.0.tgz"
SRC_URI[md5sum] = "c93bce6792c1d882b652a8d29cc74290"
SRC_URI[sha256sum] = "c601fbb8dff51574726ee627dc24d8d0a3e5cb6da2a4165f8e8f31353f062e63"

NPM_PKGNAME = "@cspell/dict-en_us"

inherit npmhelper
inherit native
