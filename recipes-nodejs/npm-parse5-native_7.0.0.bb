SUMMARY = "NPM: parse5"
DESCRIPTION = "HTML parser and serializer."
HOMEPAGE = "https://github.com/inikulin/parse5"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=179850e04995d6fceaf64f2dd2a851b0"

DEPENDS = "npm-entities-native"

SRC_URI = "https://registry.npmjs.org/parse5/-/parse5-7.0.0.tgz"
SRC_URI[md5sum] = "b075b7d127be223d5d81134657d564de"
SRC_URI[sha256sum] = "870cf28122d322c9ad4b7b23b4ef2589e898b89bea49f3066a2f93a139133b31"

NPM_PKGNAME = "parse5"

inherit npmhelper
inherit native
