SUMMARY = "SCA description for xmllint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "nativesdk-libxml2"

inherit sca-description
inherit_defer nativesdk
SCA_TOOL_DESCRIPTION = "xmllint"
RDEPENDS:${PN}:class-nativesdk += "nativesdk-libxml2"
