SUMMARY = "NPM: @cspell/dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_GB#readme"

LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=269b61481c4657dc5f08f1fed4110cea"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en-gb/-/dict-en-gb-2.0.1.tgz"
SRC_URI[md5sum] = "51a1a734305b8a8406d3dfcc35898b86"
SRC_URI[sha256sum] = "9459d3f51ee33fd090776626268bff8c6c72a04bee50754e4b8545e769c445eb"

NPM_PKGNAME = "@cspell/dict-en-gb"

inherit npmhelper
inherit native
