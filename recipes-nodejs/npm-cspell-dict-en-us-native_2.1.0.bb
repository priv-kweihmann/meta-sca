SUMMARY = "NPM: @cspell/dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en_us/-/dict-en_us-2.1.0.tgz"
SRC_URI[md5sum] = "1945538d34065c59daecd594e2c51e66"
SRC_URI[sha256sum] = "b694c91dab2a5d613f35c26ad044d9d95718a913901c0bc3baa3fb4ddd663491"

NPM_PKGNAME = "@cspell/dict-en_us"

inherit npmhelper
inherit native
