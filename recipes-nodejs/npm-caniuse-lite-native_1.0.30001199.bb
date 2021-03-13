SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001199.tgz"
SRC_URI[md5sum] = "cf728fa0dd8a986aa5206b5f7940aae2"
SRC_URI[sha256sum] = "7c3e0fa7df36a0b28f5864f90777c79444922583ee273364c0eea7d73d5be202"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
