SUMMARY = "NPM: character-entities"
DESCRIPTION = "HTML character entity information"
HOMEPAGE = "https://github.com/wooorm/character-entities#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/character-entities/-/character-entities-2.0.0.tgz"
SRC_URI[md5sum] = "b1a5a3295eb9b761345f4a61de83e768"
SRC_URI[sha256sum] = "8cec8ad0b72296101853b0f42cf00657cece9d43a16e878ba58f533bd2b38959"

NPM_PKGNAME = "character-entities"

inherit npmhelper
inherit native
