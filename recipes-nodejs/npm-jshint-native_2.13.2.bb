SUMMARY = "NPM: jshint"
DESCRIPTION = "Static analysis tool for JavaScript"
HOMEPAGE = "http://jshint.com/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4e19041df56fbb7a49fb87c4322d5849"

DEPENDS = "npm-cli-native \
           npm-console-browserify-native \
           npm-exit-native \
           npm-htmlparser2-native \
           npm-lodash-native \
           npm-minimatch-native \
           npm-shelljs-native \
           npm-strip-json-comments-native"

SRC_URI = "https://registry.npmjs.org/jshint/-/jshint-2.13.2.tgz"
SRC_URI[md5sum] = "fc29ae14cf9ff96badf564231b702709"
SRC_URI[sha256sum] = "8c3d0e6dc4e9552de64738db0440ee93582e3fd75efadd858702272e24e9a533"

NPM_PKGNAME = "jshint"

inherit npmhelper
inherit native
