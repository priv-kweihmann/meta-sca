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

SRC_URI = "https://registry.npmjs.org/htmlhint/-/htmlhint-0.15.1.tgz"
SRC_URI[md5sum] = "b8bd06b8a4929ae891d1751284736cea"
SRC_URI[sha256sum] = "f1610b4ec021c6a5bf74340a0befa7afd93386071031dd97f4874e7991db0e59"

NPM_PKGNAME = "htmlhint"

inherit npmhelper
inherit native
