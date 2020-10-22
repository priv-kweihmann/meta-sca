SUMMARY = "NPM: cspell-dict-bash"
DESCRIPTION = "Bash dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/bash#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-bash/-/cspell-dict-bash-1.0.5.tgz"
SRC_URI[md5sum] = "f4d9ddbe86c45a1b89ba62b01539e304"
SRC_URI[sha256sum] = "b9649bcd78785adbefae24a046a6e8d6a0171acfcf6d4224f0fa3649369314fa"

NPM_PKGNAME = "cspell-dict-bash"

inherit npmhelper
inherit native
