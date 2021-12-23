SUMMARY = "NPM: @cspell/dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_US#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en_us/-/dict-en_us-2.1.4.tgz"
SRC_URI[md5sum] = "ad3bdca876a8a43012844c5026caa8fd"
SRC_URI[sha256sum] = "84efba0089fa67820fb1308587bbcdd3d5b636f7b79b7ee85254d15bde3e2310"

NPM_PKGNAME = "@cspell/dict-en_us"

inherit npmhelper
inherit native
