SUMMARY = "NPM: cspell-dict-fullstack"
DESCRIPTION = "Dictionary of terms used in Fullstack development."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/fullstack#readme"

DEPENDS = "npm-configstore-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

SRC_URI = "https://registry.npmjs.org/cspell-dict-fullstack/-/cspell-dict-fullstack-1.0.23.tgz"
SRC_URI[md5sum] = "518ea0b6425622f8e1524fe4fbea38fd"
SRC_URI[sha256sum] = "01434d8ae58750b16f45d62ec0d292fbf981994b7619efb0bfacccccb36da272"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-dict-fullstack"

inherit npmhelper
inherit native
