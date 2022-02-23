SUMMARY = "NPM: @cspell/dict-haskell"
DESCRIPTION = "Haskell dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/haskell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-haskell/-/dict-haskell-2.0.0.tgz"
SRC_URI[md5sum] = "28800f4e30a6ac5f06927391403a6006"
SRC_URI[sha256sum] = "f50884744bc445d41795182f547906d7c3f95d01f504ebccce64ba45a5bc3bdd"

NPM_PKGNAME = "@cspell/dict-haskell"

inherit npmhelper
inherit native
