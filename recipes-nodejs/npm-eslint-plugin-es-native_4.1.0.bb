SUMMARY = "NPM: eslint-plugin-es"
DESCRIPTION = "ESLint plugin about ECMAScript syntactic features."
HOMEPAGE = "https://github.com/mysticatea/eslint-plugin-es#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8f21789009221b0b37faaa24544da54"

DEPENDS = "npm-eslint-utils-native \
           npm-regexpp-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-es/-/eslint-plugin-es-4.1.0.tgz"
SRC_URI[md5sum] = "9963859305a15e428342afbf392ca916"
SRC_URI[sha256sum] = "9a8577d185e2ed82f0093348144b1188840369518fe30e4d531c0130abeb7c21"

NPM_PKGNAME = "eslint-plugin-es"

inherit npmhelper
inherit native
