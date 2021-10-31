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

SRC_URI = "https://registry.npmjs.org/listr2/-/listr2-3.13.1.tgz"
SRC_URI[md5sum] = "237119b99905a04718ade915a689c988"
SRC_URI[sha256sum] = "61e72ea8e087ae8869fc6eb0958a54a8431646fb850e915ca0e7e9b035b3ca11"

NPM_PKGNAME = "listr2"

inherit npmhelper
inherit native
