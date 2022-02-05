SUMMARY = "NPM: @cspell/dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_US#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en_us/-/dict-en_us-2.1.5.tgz"
SRC_URI[md5sum] = "c9a5527b45424ddf0d458dc8e9f99bbd"
SRC_URI[sha256sum] = "c2f4c8c7f716a9cdd941f4e6b171ed1af99fb4d94190bddc858d08a5fcf184f1"

NPM_PKGNAME = "@cspell/dict-en_us"

inherit npmhelper
inherit native
