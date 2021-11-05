SUMMARY = "NPM: listr2"
DESCRIPTION = "Terminal task list reborn! Create beautiful CLI interfaces via easy and logical to implement task lists that feel alive and interactive."
HOMEPAGE = "https://github.com/cenk1cenk2/listr2#readme"

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

SRC_URI = "https://registry.npmjs.org/listr2/-/listr2-3.13.3.tgz"
SRC_URI[md5sum] = "30e870dd956d536f77114fe2fe0931d7"
SRC_URI[sha256sum] = "ff742e2700e7ece519cd84b6c0dd3a3e6cff92b908ea8ebf05000620893f5321"

NPM_PKGNAME = "listr2"

inherit npmhelper
inherit native
