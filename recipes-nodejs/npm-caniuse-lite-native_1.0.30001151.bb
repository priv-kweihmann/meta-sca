SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001151.tgz"
SRC_URI[md5sum] = "c6937c07d6cd5a32405607dc77e57966"
SRC_URI[sha256sum] = "ec63c333fb3420dce532068211306fcab73d1ac97e91a11cb1dd0cce436c107e"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
