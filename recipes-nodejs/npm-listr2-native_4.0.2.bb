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

SRC_URI = "https://registry.npmjs.org/listr2/-/listr2-4.0.2.tgz"
SRC_URI[md5sum] = "fecb3609a5e3a9b6f547c1b359d494db"
SRC_URI[sha256sum] = "972622affdf8b02a02ae91eae30a6bd0fa159d739f4812e21f63f41c7cff153f"

NPM_PKGNAME = "listr2"

inherit npmhelper
inherit native
