SUMMARY = "NPM: listr2"
DESCRIPTION = "Terminal task list reborn! Create beautiful CLI interfaces via easy and logical to implement task lists that feel alive and interactive."
HOMEPAGE = "https://github.com/cenk1cenk2/listr2#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=04c495203ab16a62384075f5ef0477d4"

DEPENDS = "npm-cli-truncate-native \
           npm-clone-native \
           npm-colorette-native \
           npm-log-update-native \
           npm-p-map-native \
           npm-rxjs-native \
           npm-through-native \
           npm-wrap-ansi-native"

SRC_URI = "https://registry.npmjs.org/listr2/-/listr2-3.13.4.tgz"
SRC_URI[md5sum] = "90c7ce8a9546d42bd1d761b1e9ac2960"
SRC_URI[sha256sum] = "a1154d9c34886a8b3cac06f66f8e75b1f8055e6e790ff5286fdac33a42f6d3cc"

NPM_PKGNAME = "listr2"

inherit npmhelper
inherit native
