SUMMARY = "NPM: cspell-dict-golang"
DESCRIPTION = "Go Language dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/golang#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-golang/-/cspell-dict-golang-1.1.23.tgz"
SRC_URI[md5sum] = "a0ece2654a09e92e9bf94db757bc2257"
SRC_URI[sha256sum] = "cbfa075a96c074d4ebdb24875b095cf21d173f161b77300711d52ea1035e465a"

NPM_PKGNAME = "cspell-dict-golang"

inherit npmhelper
inherit native
