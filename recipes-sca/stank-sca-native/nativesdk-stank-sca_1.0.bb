SUMMARY = "SCA description for stank"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "nativesdk-github.com-mcandre-stank"

S = "${UNPACKDIR}"

inherit sca-description
inherit_defer nativesdk
SCA_TOOL_DESCRIPTION = "stank"
RDEPENDS:${PN}:class-nativesdk += "nativesdk-github.com-mcandre-stank"
