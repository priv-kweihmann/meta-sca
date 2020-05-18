SUMMARY = "NPM: cspell-dict-bash"
DESCRIPTION = "Bash dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/bash#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-bash/-/cspell-dict-bash-1.0.3.tgz"
SRC_URI[md5sum] = "095c88366892ca9f5dec2b1433833bd1"
SRC_URI[sha256sum] = "41b3c82fc3dda63b22de08c2570b748944b8e86ffc9af512214be7cb07935d16"

NPM_PKGNAME = "cspell-dict-bash"

inherit npmhelper
inherit native
