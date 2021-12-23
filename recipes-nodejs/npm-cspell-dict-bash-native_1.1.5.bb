SUMMARY = "NPM: cspell-dict-bash"
DESCRIPTION = "Bash dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/bash#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-bash/-/cspell-dict-bash-1.1.5.tgz"
SRC_URI[md5sum] = "19ca4d67d252541809b47cf700eb2576"
SRC_URI[sha256sum] = "1c987e9c71880e126ee3280ec94737ea04dea0475c4468ce6d8af692a85c5d67"

NPM_PKGNAME = "cspell-dict-bash"

inherit npmhelper
inherit native
