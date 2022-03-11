SUMMARY = "NPM: listr2"
DESCRIPTION = "Terminal task list reborn! Create beautiful CLI interfaces via easy and logical to implement task lists that feel alive and interactive."
HOMEPAGE = "https://github.com/cenk1cenk2/listr2#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=04c495203ab16a62384075f5ef0477d4"

DEPENDS = "npm-cli-truncate-native \
           npm-colorette-native \
           npm-log-update-native \
           npm-p-map-native \
           npm-rfdc-native \
           npm-rxjs-native \
           npm-through-native \
           npm-wrap-ansi-native"

SRC_URI = "https://registry.npmjs.org/listr2/-/listr2-4.0.5.tgz"
SRC_URI[md5sum] = "7ae8ba7dfb0f04721b26a6ed6797fcdb"
SRC_URI[sha256sum] = "27d9f412ca014ee93bed9921777300be709d3cd962dddc50189bf84757d58900"

NPM_PKGNAME = "listr2"

inherit npmhelper
inherit native
