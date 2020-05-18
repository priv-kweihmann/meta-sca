SUMMARY = "NPM: eslint-plugin-es"
DESCRIPTION = "ESLint plugin about ECMAScript syntactic features."
HOMEPAGE = "https://github.com/mysticatea/eslint-plugin-es#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8f21789009221b0b37faaa24544da54"

DEPENDS = "npm-eslint-utils-native \
           npm-regexpp-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-es/-/eslint-plugin-es-3.0.1.tgz"
SRC_URI[md5sum] = "40a1f24e265081a0051f1c06880c763f"
SRC_URI[sha256sum] = "ac7440d86a323cf38a6ff35169f19790aff27d0b226e3e4bb31146fd08548d12"

NPM_PKGNAME = "eslint-plugin-es"

inherit npmhelper
inherit native
