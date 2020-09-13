SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001128.tgz"
SRC_URI[md5sum] = "3d07e8ece47524d880c85e0f971a400c"
SRC_URI[sha256sum] = "43902bc428ddd89a870e5b980cee2ace0acca620e209de6a5a9816cb54b8909d"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
