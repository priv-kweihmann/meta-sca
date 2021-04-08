SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001208.tgz"
SRC_URI[md5sum] = "9a80c0d8db21634f6637f67ff223debc"
SRC_URI[sha256sum] = "19944793d524f7f5d4ab5c08ebbb094d233e5b0f9e0637fe4c4f729aa0f29f2a"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
