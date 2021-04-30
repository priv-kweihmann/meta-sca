SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001219.tgz"
SRC_URI[md5sum] = "e76b4eb460f685ff504a17c42bf4730e"
SRC_URI[sha256sum] = "d6d2dac966cd56316b1e7d49aa08e250bb27396a5afc5f8ce2c87fb3489b71ab"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
