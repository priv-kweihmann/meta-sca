SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001159.tgz"
SRC_URI[md5sum] = "b46d217ef54c01c394b798e22f253c19"
SRC_URI[sha256sum] = "dffc5547f7cda39d971da3fd890eaef41d64ba872c2964835c945dba406ad6e4"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
