SUMMARY = "NPM: @cspell/dict-filetypes"
DESCRIPTION = "Filetypes dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/filetypes#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-filetypes/-/dict-filetypes-2.0.1.tgz"
SRC_URI[md5sum] = "443f73735a6cb52646566630bf0f493c"
SRC_URI[sha256sum] = "5833f000d98f9ec757cc48db62ad92b959e56cb4349977cc29c0b13429f8a18c"

NPM_PKGNAME = "@cspell/dict-filetypes"

inherit npmhelper
inherit native
