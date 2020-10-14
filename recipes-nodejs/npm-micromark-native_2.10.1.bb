SUMMARY = "NPM: micromark"
DESCRIPTION = "small commonmark compliant markdown parser with positional info and concrete tokens"
HOMEPAGE = "https://github.com/micromark/micromark#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-debug-native \
           npm-parse-entities-native"

SRC_URI = "https://registry.npmjs.org/micromark/-/micromark-2.10.1.tgz"
SRC_URI[md5sum] = "efdec62a4f2d666d7430b83bb3d130da"
SRC_URI[sha256sum] = "a8eeaf0e17be194dc930df304c83a6e907b2f5c9fd11ac07b1026e271afb5f54"

NPM_PKGNAME = "micromark"

inherit npmhelper
inherit native
