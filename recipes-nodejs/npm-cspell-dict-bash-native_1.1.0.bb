SUMMARY = "NPM: cspell-dict-bash"
DESCRIPTION = "Bash dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/bash#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-bash/-/cspell-dict-bash-1.1.0.tgz"
SRC_URI[md5sum] = "fb89718a3bf300a1f6fb53daf9300fef"
SRC_URI[sha256sum] = "907a50143e12fb225f13b174bcc7a6075c081038d2d74dbbc0ed97f88e82572b"

NPM_PKGNAME = "cspell-dict-bash"

inherit npmhelper
inherit native
