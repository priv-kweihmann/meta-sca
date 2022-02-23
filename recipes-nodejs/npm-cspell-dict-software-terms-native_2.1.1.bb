SUMMARY = "NPM: @cspell/dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/software-terms#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-software-terms/-/dict-software-terms-2.1.1.tgz"
SRC_URI[md5sum] = "d79fed27fc8ab07b83b4280e1882914a"
SRC_URI[sha256sum] = "582ece933427f312c12ff0f64fe2fa61058e1f1cbb880647452883bf5fcfc679"

NPM_PKGNAME = "@cspell/dict-software-terms"

inherit npmhelper
inherit native
