SUMMARY = "NPM: cspell-dict-bash"
DESCRIPTION = "Bash dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/bash#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-bash/-/cspell-dict-bash-1.0.7.tgz"
SRC_URI[md5sum] = "6bc593e82ba96559c89bfca41afe0804"
SRC_URI[sha256sum] = "d73de0223031075ae4216d1956058b65c4a44a39b2f17670731751cc31ed72a9"

NPM_PKGNAME = "cspell-dict-bash"

inherit npmhelper
inherit native
