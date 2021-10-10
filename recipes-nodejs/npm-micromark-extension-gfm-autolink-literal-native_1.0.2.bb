SUMMARY = "NPM: micromark-extension-gfm-autolink-literal"
DESCRIPTION = "micromark extension to support GFM autolink literals"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-autolink-literal#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-util-character-native \
           npm-micromark-util-sanitize-uri-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-autolink-literal/-/micromark-extension-gfm-autolink-literal-1.0.2.tgz"
SRC_URI[md5sum] = "59d84693e36bad59d45c932a26c0e672"
SRC_URI[sha256sum] = "08f1c16c20ca535a2c39693ebade4488b6eb45c081a505513515f903941b4a82"

NPM_PKGNAME = "micromark-extension-gfm-autolink-literal"

inherit npmhelper
inherit native
