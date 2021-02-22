SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001191.tgz"
SRC_URI[md5sum] = "7763e8d56ed14702693fec49c66e333c"
SRC_URI[sha256sum] = "e17577ef85f0132347004fb869f4bf69b1a236b61f4fe3de22329536cc6405c1"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
