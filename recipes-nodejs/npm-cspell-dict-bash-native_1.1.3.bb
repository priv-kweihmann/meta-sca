SUMMARY = "NPM: cspell-dict-bash"
DESCRIPTION = "Bash dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/bash#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-bash/-/cspell-dict-bash-1.1.3.tgz"
SRC_URI[md5sum] = "8d176cf7571a80eb8c8aef3bcf2f7194"
SRC_URI[sha256sum] = "dacfd5f1e29b5126e2770baee3e4c615c6579fec3baca3ed3d686ac6f91591da"

NPM_PKGNAME = "cspell-dict-bash"

inherit npmhelper
inherit native
