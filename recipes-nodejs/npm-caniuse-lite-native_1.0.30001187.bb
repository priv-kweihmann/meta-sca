SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001187.tgz"
SRC_URI[md5sum] = "8664e2a15bf392a0e111a9d29d5308b4"
SRC_URI[sha256sum] = "4a1bc049ffba023ca83326913f28f86272569e41232d158e4b63377cc33e9ba8"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
