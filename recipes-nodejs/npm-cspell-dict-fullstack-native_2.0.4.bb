SUMMARY = "NPM: @cspell/dict-fullstack"
DESCRIPTION = "Dictionary of terms used in Fullstack development."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/fullstack#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-fullstack/-/dict-fullstack-2.0.4.tgz"
SRC_URI[md5sum] = "76ad9f7b37b398bcc8111d93402a1aa5"
SRC_URI[sha256sum] = "30b9e663d7b25fe1ebd6e49f161ae4e54bd738629bff9d08dcb661085dddcc21"

NPM_PKGNAME = "@cspell/dict-fullstack"

inherit npmhelper
inherit native
