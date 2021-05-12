SUMMARY = "NPM: cspell-dict-fullstack"
DESCRIPTION = "Dictionary of terms used in Fullstack development."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/fullstack#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-fullstack/-/cspell-dict-fullstack-1.1.4.tgz"
SRC_URI[md5sum] = "82b95860a299945b7ac485b64b02ff70"
SRC_URI[sha256sum] = "86e036dd944a0564c284fd5c691cc605defce35a08a0f617dbde136261449fbb"

NPM_PKGNAME = "cspell-dict-fullstack"

inherit npmhelper
inherit native
