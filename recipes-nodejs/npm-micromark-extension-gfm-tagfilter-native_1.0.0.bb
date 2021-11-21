SUMMARY = "NPM: micromark-extension-gfm-tagfilter"
DESCRIPTION = "micromark extension to support GFM tagfilter"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-tagfilter#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-tagfilter/-/micromark-extension-gfm-tagfilter-1.0.0.tgz"
SRC_URI[md5sum] = "79ae2c13784a905edc931fa36c502c54"
SRC_URI[sha256sum] = "739f97ca82fff44da7cf68788b039085ffa5301a3045013d9cd30b353f47b5db"

NPM_PKGNAME = "micromark-extension-gfm-tagfilter"

inherit npmhelper
inherit native
