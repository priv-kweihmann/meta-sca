SUMMARY = "NPM: zwitch"
DESCRIPTION = "Handle values based on a property"
HOMEPAGE = "https://github.com/wooorm/zwitch#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/zwitch/-/zwitch-1.0.5.tgz"
SRC_URI[md5sum] = "4c999e34ba7f981164b8457c713e31fd"
SRC_URI[sha256sum] = "411edc18260f2e79c6705fd0b32fe1a0c5050c231952c76fc19d2973bf90d927"

NPM_PKGNAME = "zwitch"

inherit npmhelper
inherit native
