SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001124.tgz"
SRC_URI[md5sum] = "579167832218336c352339f169a975bc"
SRC_URI[sha256sum] = "07f258e6f109e2e9ce53d95105f9a2f82866c0d7b96c93f638bb3b73bedb9092"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
