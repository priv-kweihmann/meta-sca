SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001133.tgz"
SRC_URI[md5sum] = "ddc20fd857a014e73e385f9e081067e7"
SRC_URI[sha256sum] = "9a15f03e4d47c1051ea16c240aa4644bd301a0c09277ab1b079523a759998439"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
