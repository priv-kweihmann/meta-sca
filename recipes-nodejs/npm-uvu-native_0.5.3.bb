SUMMARY = "NPM: uvu"
DESCRIPTION = "uvu is an extremely fast and lightweight test runner for Node.js and the browser"
HOMEPAGE = "https://github.com/lukeed/uvu#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=75a8a6449fca39883a2bcfd1d6ddac5a"

DEPENDS = "npm-dequal-native \
           npm-diff-native \
           npm-kleur-native \
           npm-sade-native"

SRC_URI = "https://registry.npmjs.org/uvu/-/uvu-0.5.3.tgz"
SRC_URI[md5sum] = "f78f896970886802be8d27da7e204139"
SRC_URI[sha256sum] = "bde1416d9c5bce817d9ca916f6fe3aca79b6c5f279b1e69a7714026b6e7f6691"

NPM_PKGNAME = "uvu"

inherit npmhelper
inherit native
