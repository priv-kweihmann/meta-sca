SUMMARY = "NPM: @cspell/dict-ada"
DESCRIPTION = "Ada Language dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/ada#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-ada/-/dict-ada-2.0.0.tgz"
SRC_URI[md5sum] = "85a17f687ce6b75cb26abaafd9159285"
SRC_URI[sha256sum] = "215574efa47a29af2d3012100b8a24eb545c318f1aef0dfac3efdc6f44b96ff5"

NPM_PKGNAME = "@cspell/dict-ada"

inherit npmhelper
inherit native
