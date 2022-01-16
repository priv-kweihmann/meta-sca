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

SRC_URI = "https://registry.npmjs.org/listr2/-/listr2-4.0.1.tgz"
SRC_URI[md5sum] = "40999e7e6929da315bd07bf4da8afa3c"
SRC_URI[sha256sum] = "330f6a8ad4bcea2987a05abf0d0057782252675731f1881d23ebc777b8a61134"

NPM_PKGNAME = "listr2"

inherit npmhelper
inherit native
