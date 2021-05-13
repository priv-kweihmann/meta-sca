SUMMARY = "NPM: @secretlint/secretlint-rule-no-k8s-kind-secret"
DESCRIPTION = "A secretlint rule that disallow to use Kind: Secret in Kubernetes repository."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-no-k8s-kind-secret/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-js-yaml-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-no-k8s-kind-secret/-/secretlint-rule-no-k8s-kind-secret-2.1.1.tgz"
SRC_URI[md5sum] = "74a4086897919ecab0dd78c88d024d0c"
SRC_URI[sha256sum] = "d073deaba0842b7516c8d91b22aabe09186ff1b53accde278db53b3ff510cb52"

NPM_PKGNAME = "@secretlint/secretlint-rule-no-k8s-kind-secret"

inherit npmhelper
inherit native
