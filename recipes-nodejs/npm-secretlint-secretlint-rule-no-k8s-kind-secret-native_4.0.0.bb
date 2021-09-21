SUMMARY = "NPM: @secretlint/secretlint-rule-no-k8s-kind-secret"
DESCRIPTION = "A secretlint rule that disallow to use Kind: Secret in Kubernetes repository."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-no-k8s-kind-secret/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-js-yaml-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-no-k8s-kind-secret/-/secretlint-rule-no-k8s-kind-secret-4.0.0.tgz"
SRC_URI[md5sum] = "45a151cd502a52e162f297759c4d3cd4"
SRC_URI[sha256sum] = "4fe79e0307c81d26551c68c120018a985eee084ecfc964a2672b65c1884d4266"

NPM_PKGNAME = "@secretlint/secretlint-rule-no-k8s-kind-secret"

inherit npmhelper
inherit native
