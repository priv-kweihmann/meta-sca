SUMMARY = "NPM: micromark-extension-gfm-tagfilter"
DESCRIPTION = "micromark extension to support GFM tagfilter"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-tagfilter#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-tagfilter/-/micromark-extension-gfm-tagfilter-1.0.1.tgz"
SRC_URI[md5sum] = "c90c96c4ca18dc2d9e939b858f48376b"
SRC_URI[sha256sum] = "cd516bdfe1da16c41f1dcb3fb4f306ad16cb61ae36b67bef15b96bd587796002"

NPM_PKGNAME = "micromark-extension-gfm-tagfilter"

inherit npmhelper
inherit native
