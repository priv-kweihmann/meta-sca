SUMMARY = "NPM: micromark-extension-gfm-autolink-literal"
DESCRIPTION = "micromark extension to support GFM autolink literals"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-autolink-literal#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-util-character-native \
           npm-micromark-util-sanitize-uri-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-power-assert-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-autolink-literal/-/micromark-extension-gfm-autolink-literal-1.0.1.tgz"
SRC_URI[md5sum] = "fd5868a7993257978a25d608d1fe30d9"
SRC_URI[sha256sum] = "d9fce12b1eca2dc910228a2111901aaada58026e74dc04f2a881707af28ba57f"

NPM_PKGNAME = "micromark-extension-gfm-autolink-literal"

inherit npmhelper
inherit native
