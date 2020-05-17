SUMMARY = "NPM: htmlhint"
DESCRIPTION = "The Static Code Analysis Tool for your HTML"
HOMEPAGE = "https://github.com/htmlhint/HTMLHint#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9ab22e524b729e8ba6a68fda798ad089"

DEPENDS = "npm-async-native \
           npm-colors-native \
           npm-commander-native \
           npm-esm-native \
           npm-glob-native \
           npm-parse-glob-native \
           npm-path-parse-native \
           npm-request-native \
           npm-strip-json-comments-native \
           npm-xml-native"

SRC_URI = "https://registry.npmjs.org/htmlhint/-/htmlhint-0.12.2.tgz"
SRC_URI[md5sum] = "5d65c5fbf8b19c1c2c961e6425fd8faf"
SRC_URI[sha256sum] = "61b173353e346aa01d700334e5420a50b035eda9b12ace0630c0d823aa6c4122"

NPM_PKGNAME = "htmlhint"

inherit npmhelper
inherit native
