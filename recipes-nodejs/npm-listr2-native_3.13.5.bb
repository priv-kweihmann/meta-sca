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

SRC_URI = "https://registry.npmjs.org/listr2/-/listr2-3.13.5.tgz"
SRC_URI[md5sum] = "e04c36327fb2160e4df75b6ab104db5a"
SRC_URI[sha256sum] = "9c1581002ccd0bda5577d248e98e0ab1b79bbbfcf9921872ca32fa505ce43f9c"

NPM_PKGNAME = "listr2"

inherit npmhelper
inherit native
