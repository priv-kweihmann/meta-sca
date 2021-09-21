SUMMARY = "NPM: listr2"
DESCRIPTION = "Terminal task list reborn! Create beautiful CLI interfaces via easy and logical to implement task lists that feel alive and interactive."
HOMEPAGE = "https://github.com/cenk1cenk2/listr2#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=04c495203ab16a62384075f5ef0477d4"

DEPENDS = "npm-cli-truncate-native \
           npm-colorette-native \
           npm-log-update-native \
           npm-p-map-native \
           npm-rxjs-native \
           npm-through-native \
           npm-wrap-ansi-native"

SRC_URI = "https://registry.npmjs.org/listr2/-/listr2-3.12.1.tgz"
SRC_URI[md5sum] = "a45ac55c30f80c0bcb771d738abc1d03"
SRC_URI[sha256sum] = "930698905635ba154bccdcfec00938457f6510353c6e68b087f73088f90e2432"

NPM_PKGNAME = "listr2"

inherit npmhelper
inherit native
