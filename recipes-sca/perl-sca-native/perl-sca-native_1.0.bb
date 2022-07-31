SUMMARY = "SCA description for perl"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "perl-native"

inherit sca-description
inherit native

SCA_TOOL_DESCRIPTION = "perl"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

FILES:${PN} += "${datadir}"

RDEPENDS:${PN}:class-nativesdk += "nativesdk-perl"
