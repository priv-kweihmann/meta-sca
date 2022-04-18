SUMMARY = "NPM: htmlhint"
DESCRIPTION = "The Static Code Analysis Tool for your HTML"
HOMEPAGE = "https://htmlhint.com"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9ab22e524b729e8ba6a68fda798ad089"

DEPENDS = "npm-async-native \
           npm-chalk-native \
           npm-commander-native \
           npm-glob-native \
           npm-is-glob-native \
           npm-node-fetch-native \
           npm-strip-json-comments-native \
           npm-xml-native"

SRC_URI = "https://registry.npmjs.org/htmlhint/-/htmlhint-1.1.4.tgz"
SRC_URI[md5sum] = "d358b2de519fbc0bb899f7d8577b4e7f"
SRC_URI[sha256sum] = "fdf180ae50d48cec687c5894f8db31c5a1d2b37182919a81cb2c3f06b0a33491"

NPM_PKGNAME = "htmlhint"

inherit npmhelper
inherit native
