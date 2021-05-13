SUMMARY = "NPM: aggregate-error"
DESCRIPTION = "Create an error from multiple errors"
HOMEPAGE = "https://github.com/sindresorhus/aggregate-error#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-clean-stack-native \
           npm-indent-string-native"

SRC_URI = "https://registry.npmjs.org/aggregate-error/-/aggregate-error-3.1.0.tgz"
SRC_URI[md5sum] = "16dd9122f632da20697f8ed47c7bbcc1"
SRC_URI[sha256sum] = "03360cb8b5aba425c69ede72e465bbd7847104209048c95200b6b432c98b205b"

NPM_PKGNAME = "aggregate-error"

inherit npmhelper
inherit native
