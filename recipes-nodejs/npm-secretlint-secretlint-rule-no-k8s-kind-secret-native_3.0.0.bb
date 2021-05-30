SUMMARY = "NPM: @secretlint/secretlint-rule-no-k8s-kind-secret"
DESCRIPTION = "A secretlint rule that disallow to use Kind: Secret in Kubernetes repository."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-no-k8s-kind-secret/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-js-yaml-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-no-k8s-kind-secret/-/secretlint-rule-no-k8s-kind-secret-3.0.0.tgz"
SRC_URI[md5sum] = "d29d3bd6aa91069a5c52ebf8ed3604b3"
SRC_URI[sha256sum] = "f5207c44d7b0260623416fdf18c70038fb5e8ffbbea14933842a98d6cb642a12"

NPM_PKGNAME = "@secretlint/secretlint-rule-no-k8s-kind-secret"

inherit npmhelper
inherit native
