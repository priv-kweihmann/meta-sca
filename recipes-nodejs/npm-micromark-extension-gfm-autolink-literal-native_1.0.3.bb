SUMMARY = "NPM: micromark-extension-gfm-autolink-literal"
DESCRIPTION = "micromark extension to support GFM autolink literals"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-autolink-literal#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-util-character-native \
           npm-micromark-util-sanitize-uri-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-autolink-literal/-/micromark-extension-gfm-autolink-literal-1.0.3.tgz"
SRC_URI[md5sum] = "088fa743b6b48cdc0d7abc3487dcc027"
SRC_URI[sha256sum] = "09f5ce9f1ee611fadf331ccafa0227669e3b35583761ff03e40aa9f70e7e7d53"

NPM_PKGNAME = "micromark-extension-gfm-autolink-literal"

inherit npmhelper
inherit native
