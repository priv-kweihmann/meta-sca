SUMMARY = "NPM: @cspell/dict-bash"
DESCRIPTION = "Bash dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/bash#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-bash/-/dict-bash-2.0.1.tgz"
SRC_URI[md5sum] = "3611a3afaf7469da7a0c7cbd53f5d5a3"
SRC_URI[sha256sum] = "9706f9b85f16b27bde46983255eacea3e64abea2986061dbfac48217b6be3d44"

NPM_PKGNAME = "@cspell/dict-bash"

inherit npmhelper
inherit native
