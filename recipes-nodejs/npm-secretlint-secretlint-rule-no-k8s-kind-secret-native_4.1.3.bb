SUMMARY = "NPM: @secretlint/secretlint-rule-no-k8s-kind-secret"
DESCRIPTION = "A secretlint rule that disallow to use Kind: Secret in Kubernetes repository."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-no-k8s-kind-secret/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-js-yaml-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-no-k8s-kind-secret/-/secretlint-rule-no-k8s-kind-secret-4.1.3.tgz"
SRC_URI[md5sum] = "419ef0b91cc1e9b0dcfaaf82a1a96775"
SRC_URI[sha256sum] = "187f43b7843e9523a87663f4fa641f487087fac25631a87948b66bfa81c1de03"

NPM_PKGNAME = "@secretlint/secretlint-rule-no-k8s-kind-secret"

inherit npmhelper
inherit native
