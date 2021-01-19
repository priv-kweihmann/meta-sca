SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001178.tgz"
SRC_URI[md5sum] = "c324f5bdc0298abd1f949ca34ba1abe4"
SRC_URI[sha256sum] = "66e27c8a988af3207d990461d19be2bd12a3707e26135c7762fffdf6d5017d9e"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
