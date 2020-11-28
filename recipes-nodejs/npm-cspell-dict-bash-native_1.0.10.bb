SUMMARY = "NPM: cspell-dict-bash"
DESCRIPTION = "Bash dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/bash#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-bash/-/cspell-dict-bash-1.0.10.tgz"
SRC_URI[md5sum] = "62cafef396253b2fd907ee251045bbbd"
SRC_URI[sha256sum] = "a733c51f70772faa8bd4a4a49ab9356c6cd15e6eae0e68933b2845b1eea4eea5"

NPM_PKGNAME = "cspell-dict-bash"

inherit npmhelper
inherit native
