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

SRC_URI = "https://registry.npmjs.org/listr2/-/listr2-3.12.2.tgz"
SRC_URI[md5sum] = "ce20a330ae300e687eb3e32c981d2135"
SRC_URI[sha256sum] = "0a2e0fbc1c2aa843c1b5723a10ffc432b97a20817f250035b5338a97a5145e08"

NPM_PKGNAME = "listr2"

inherit npmhelper
inherit native
