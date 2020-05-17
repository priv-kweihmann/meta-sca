SUMMARY = "NPM: wrap-fn"
DESCRIPTION = "support sync, async, and generator functions"
HOMEPAGE = "https://github.com/matthewmueller/wrap-fn#readme"

DEPENDS = "npm-co-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://Readme.md;beginline=60;md5=85128fc4aa7b70f4ead62d314bb2f065"

SRC_URI = "https://registry.npmjs.org/wrap-fn/-/wrap-fn-0.1.5.tgz"
SRC_URI[md5sum] = "72d38ccc3e1c373e4a01887eaa003d99"
SRC_URI[sha256sum] = "e422aa601622b102d2510cbe4e817d8882cebb26e6681484600c4e80b2d4fcd0"

NPM_PKGNAME = "wrap-fn"

inherit npmhelper
inherit native
