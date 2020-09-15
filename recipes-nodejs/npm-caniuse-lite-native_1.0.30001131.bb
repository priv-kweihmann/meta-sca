SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001131.tgz"
SRC_URI[md5sum] = "f202066c574681be06ae2e44d3cc6169"
SRC_URI[sha256sum] = "0a24eca994e3b4bef8521a95d897ecad5feb533a1324278874f8138835d78fae"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
