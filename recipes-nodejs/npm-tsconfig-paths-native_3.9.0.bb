SUMMARY = "NPM: tsconfig-paths"
DESCRIPTION = "Load node modules according to tsconfig paths, in run-time or via API."
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c17ca18a648da5ade1f324b80ea4540"

DEPENDS = "npm-json5-native \
           npm-minimist-native \
           npm-strip-bom-native \
           npm-types-json5-native"

SRC_URI = "https://registry.npmjs.org/tsconfig-paths/-/tsconfig-paths-3.9.0.tgz"
SRC_URI[md5sum] = "bef10b1886b06c7d8d397ed03f88bc67"
SRC_URI[sha256sum] = "3eb552f2b22667f4507e4a06456299857153eb260cbf08636e821acc93d24304"

NPM_PKGNAME = "tsconfig-paths"

inherit npmhelper
inherit native
