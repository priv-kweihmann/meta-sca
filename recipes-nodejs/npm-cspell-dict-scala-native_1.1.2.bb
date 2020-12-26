SUMMARY = "NPM: cspell-dict-scala"
DESCRIPTION = "Scala dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/scala#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-scala/-/cspell-dict-scala-1.1.2.tgz"
SRC_URI[md5sum] = "ca4bf9b8acf8c6d6875591836859f936"
SRC_URI[sha256sum] = "e824e700ee339844baa277e430d981f9d2604324e71edca9d5522deb2a2694fa"

NPM_PKGNAME = "cspell-dict-scala"

inherit npmhelper
inherit native
