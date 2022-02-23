SUMMARY = "NPM: @cspell/dict-node"
DESCRIPTION = "Node.js dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/node#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-node/-/dict-node-2.0.0.tgz"
SRC_URI[md5sum] = "6363674853849d3f4511d927212a691e"
SRC_URI[sha256sum] = "79e72976d33f042cb6b78993ca9f371a4e3934598b4ccd16112fe8f54ec1dc15"

NPM_PKGNAME = "@cspell/dict-node"

inherit npmhelper
inherit native
