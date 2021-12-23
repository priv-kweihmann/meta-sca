SUMMARY = "NPM: @cspell/dict-ada"
DESCRIPTION = "Ada Language dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/dictionaries/ada#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-ada/-/dict-ada-1.1.2.tgz"
SRC_URI[md5sum] = "aaff9af6857fdad4ed37d472ed1a585c"
SRC_URI[sha256sum] = "4777ebd25eb7d41d7c0d8791bae931836ebc0de61805614ee2eea94679c2860e"

NPM_PKGNAME = "@cspell/dict-ada"

inherit npmhelper
inherit native
