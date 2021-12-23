SUMMARY = "NPM: zwitch"
DESCRIPTION = "Handle values based on a property"
HOMEPAGE = "https://github.com/wooorm/zwitch#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/zwitch/-/zwitch-2.0.2.tgz"
SRC_URI[md5sum] = "e4c4923926986147e33f2846ef8bc79e"
SRC_URI[sha256sum] = "602be80ba8effccc2afa1c33d309d4a372575acd3a45639ff3d8d244faaac869"

NPM_PKGNAME = "zwitch"

inherit npmhelper
inherit native
