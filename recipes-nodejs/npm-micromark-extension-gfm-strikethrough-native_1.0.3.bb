SUMMARY = "NPM: micromark-extension-gfm-strikethrough"
DESCRIPTION = "micromark extension to support GFM strikethrough"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-strikethrough#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-util-chunked-native \
           npm-micromark-util-classify-character-native \
           npm-micromark-util-resolve-all-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-strikethrough/-/micromark-extension-gfm-strikethrough-1.0.3.tgz"
SRC_URI[md5sum] = "85a8bc30f3536741eb06af2da6577e54"
SRC_URI[sha256sum] = "e21c2066441773e841ff4242599cf27324da60a360647bb7f212cc6ed3ed9262"

NPM_PKGNAME = "micromark-extension-gfm-strikethrough"

inherit npmhelper
inherit native
