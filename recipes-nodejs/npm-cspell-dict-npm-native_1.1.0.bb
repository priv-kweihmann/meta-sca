SUMMARY = "NPM: cspell-dict-npm"
DESCRIPTION = "Dictionary of common NPM packages for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/npm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-npm/-/cspell-dict-npm-1.1.0.tgz"
SRC_URI[md5sum] = "b9e696e3f324a6c62d66b117435bad06"
SRC_URI[sha256sum] = "93d597393f363eff372c4970c035ef8de37047f35abf4f0cd0a55a8ec1050ec9"

NPM_PKGNAME = "cspell-dict-npm"

inherit npmhelper
inherit native
