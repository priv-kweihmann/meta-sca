SUMMARY = "NPM: htmlhint"
DESCRIPTION = "The Static Code Analysis Tool for your HTML"
HOMEPAGE = "https://htmlhint.com"

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

SRC_URI = "https://registry.npmjs.org/htmlhint/-/htmlhint-0.13.0.tgz"
SRC_URI[md5sum] = "549239608d4a2060ba17e3b427caa2d2"
SRC_URI[sha256sum] = "de3a62fcc8f3b45c8a412888e33c867639f3af97e824f6dbb44ef17181bf897c"

NPM_PKGNAME = "htmlhint"

inherit npmhelper
inherit native
