SUMMARY = "sca definition for secretlint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "\
            npm-secretlint-native \
            npm-secretlint-secretlint-rule-no-dotenv-native \
            npm-secretlint-secretlint-rule-no-homedir-native \
            npm-secretlint-secretlint-rule-no-k8s-kind-secret-native \
            npm-secretlint-secretlint-rule-preset-recommend-native \
            npm-secretlint-secretlint-rule-secp256k1-privatekey-native \
            "

inherit sca-description
inherit native

SCA_TOOL_DESCRIPTION = "secretlint"
