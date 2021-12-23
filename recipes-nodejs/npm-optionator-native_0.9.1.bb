SUMMARY = "NPM: optionator"
DESCRIPTION = "option parsing and help generation"
HOMEPAGE = "https://github.com/gkz/optionator"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7733af876e78a187f3a51e7c276ae883"

DEPENDS = "npm-deep-is-native \
           npm-fast-levenshtein-native \
           npm-levn-native \
           npm-prelude-ls-native \
           npm-type-check-native \
           npm-word-wrap-native"

SRC_URI = "https://registry.npmjs.org/optionator/-/optionator-0.9.1.tgz"
SRC_URI[md5sum] = "46f8e0d86e7c74204316d034b1e8d1c0"
SRC_URI[sha256sum] = "c3e6200d5ec0af0b20d78a38884c058a9574d0232a143240bc3099ccf4357c5b"

NPM_PKGNAME = "optionator"

inherit npmhelper
inherit native
