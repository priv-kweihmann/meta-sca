SUMMARY = "NPM: cspell-dict-fullstack"
DESCRIPTION = "Dictionary of terms used in Fullstack development."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/fullstack#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-fullstack/-/cspell-dict-fullstack-1.0.35.tgz"
SRC_URI[md5sum] = "646462b1e498ba313b3ff4935f4e9182"
SRC_URI[sha256sum] = "9b8615b81ab9830dd54a244c0c2da659325a6ff5dffc9b2681cdaeee638e6ea8"

NPM_PKGNAME = "cspell-dict-fullstack"

inherit npmhelper
inherit native
