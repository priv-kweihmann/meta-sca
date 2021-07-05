SUMMARY = "NPM: @secretlint/secretlint-rule-no-k8s-kind-secret"
DESCRIPTION = "A secretlint rule that disallow to use Kind: Secret in Kubernetes repository."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-no-k8s-kind-secret/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-js-yaml-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-no-k8s-kind-secret/-/secretlint-rule-no-k8s-kind-secret-3.3.0.tgz"
SRC_URI[md5sum] = "5a5178755d708f7f7157b89029f8d447"
SRC_URI[sha256sum] = "1791f1b488ada61fdbe11d84458688cb97035afcd4db651a3efb92f977dca10c"

NPM_PKGNAME = "@secretlint/secretlint-rule-no-k8s-kind-secret"

inherit npmhelper
inherit native
