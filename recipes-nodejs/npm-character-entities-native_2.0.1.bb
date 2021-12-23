SUMMARY = "NPM: character-entities"
DESCRIPTION = "Map of named character references"
HOMEPAGE = "https://github.com/wooorm/character-entities#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/character-entities/-/character-entities-2.0.1.tgz"
SRC_URI[md5sum] = "886b830d6f7b38f017956f711b401f78"
SRC_URI[sha256sum] = "33a63c7b007a4c20b55830c40ad5f2d6869ea8dbedf8db21eb4d325307a5dc85"

NPM_PKGNAME = "character-entities"

inherit npmhelper
inherit native
