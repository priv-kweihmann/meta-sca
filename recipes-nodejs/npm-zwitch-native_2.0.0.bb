SUMMARY = "NPM: zwitch"
DESCRIPTION = "Handle values based on a property"
HOMEPAGE = "https://github.com/wooorm/zwitch#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/zwitch/-/zwitch-2.0.0.tgz"
SRC_URI[md5sum] = "fc5f6020b9026938b834f65328404433"
SRC_URI[sha256sum] = "5229475adef7b2649ca214f71c4d208522d6ca6016b7e37ea7b741683dada9c6"

NPM_PKGNAME = "zwitch"

inherit npmhelper
inherit native
