SUMMARY = "NPM: htmlhint"
DESCRIPTION = "The Static Code Analysis Tool for your HTML"
HOMEPAGE = "https://htmlhint.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9ab22e524b729e8ba6a68fda798ad089"

DEPENDS = "npm-async-native \
           npm-chalk-native \
           npm-commander-native \
           npm-glob-native \
           npm-parse-glob-native \
           npm-request-native \
           npm-strip-json-comments-native \
           npm-xml-native"

SRC_URI = "https://registry.npmjs.org/htmlhint/-/htmlhint-0.14.1.tgz"
SRC_URI[md5sum] = "2502ca01373b05142bd1930b91dc7e8a"
SRC_URI[sha256sum] = "c4069928215983face971e68143f456840804d328e7602bfa2b3adc228738867"

NPM_PKGNAME = "htmlhint"

inherit npmhelper
inherit native
