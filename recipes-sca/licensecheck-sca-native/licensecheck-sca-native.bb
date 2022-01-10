SUMMARY = "Check license settings"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "\
            github.com-boyter-lc-native \
            licensecheck-helper-native \
            "

S = "${WORKDIR}"

inherit sca-description
inherit native

SCA_TOOL_DESCRIPTION = "licensecheck"

do_configure[noexec] = "1"
do_compile[noexec] = "1"
