SUMMARY = "NPM: power-assert-formatter"
DESCRIPTION = "Power Assert output formatter"
HOMEPAGE = "https://github.com/power-assert-js/power-assert-formatter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=45899cccb03bb28396a9be419b3c797e"

DEPENDS = "npm-core-js-native \
           npm-power-assert-context-formatter-native \
           npm-power-assert-context-reducer-ast-native \
           npm-power-assert-renderer-assertion-native \
           npm-power-assert-renderer-comparison-native \
           npm-power-assert-renderer-diagram-native \
           npm-power-assert-renderer-file-native"

SRC_URI = "https://registry.npmjs.org/power-assert-formatter/-/power-assert-formatter-1.4.1.tgz"
SRC_URI[md5sum] = "520b52f07ba79df9cd4051247dcf6762"
SRC_URI[sha256sum] = "9b1e474a4ed1aa00a8e37ef7b5e0f555a6518b1ca1f6660b4573ee83b9f87f98"

NPM_PKGNAME = "power-assert-formatter"

inherit npmhelper
inherit native
