SUMMARY = "NPM: @cspell/dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en_us/-/dict-en_us-2.1.3.tgz"
SRC_URI[md5sum] = "b5ee987dfca9dbd67e463d84f18e4b1e"
SRC_URI[sha256sum] = "2303978e9ff63aa492baaf1f9ea0ac746d01446c7caee760b23a95e9c6dc4fa5"

NPM_PKGNAME = "@cspell/dict-en_us"

inherit npmhelper
inherit native
