SUMMARY = "NPM: @cspell/dict-npm"
DESCRIPTION = "Dictionary of common NPM packages for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/npm#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-npm/-/dict-npm-2.0.2.tgz"
SRC_URI[md5sum] = "e023d8a0c8c45a5ff48b0a80c292db7e"
SRC_URI[sha256sum] = "4f8efcb96a3fbc06d25a9df195e5aaed43486d477670e6190c388b314fb46247"

NPM_PKGNAME = "@cspell/dict-npm"

inherit npmhelper
inherit native
