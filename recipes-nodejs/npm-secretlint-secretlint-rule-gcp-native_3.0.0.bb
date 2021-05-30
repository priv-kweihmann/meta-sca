SUMMARY = "NPM: @secretlint/secretlint-rule-gcp"
DESCRIPTION = "A secretlint rule for GCP."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-gcp/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-node-forge-native \
           npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-gcp/-/secretlint-rule-gcp-3.0.0.tgz"
SRC_URI[md5sum] = "407abf0767577ca3bb7754dbd2804f15"
SRC_URI[sha256sum] = "4eb37ef9ba49a288b7b5c626796e9d4d8e0f2f9fed271717e15d60bcf4f1cef8"

NPM_PKGNAME = "@secretlint/secretlint-rule-gcp"

inherit npmhelper
inherit native
