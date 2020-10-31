SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001154.tgz"
SRC_URI[md5sum] = "96c94d466034835976e0a1fa10d280aa"
SRC_URI[sha256sum] = "565049255bb60d60c40530e45a134781ef0191d581126014a36deeae01dbf0ba"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
