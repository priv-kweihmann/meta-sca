SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001090.tgz"
SRC_URI[md5sum] = "511e1859618e98e825d9e8fbcc65c3c2"
SRC_URI[sha256sum] = "4b6c1e979578f71930b6c4cf4232b88a6150f69d0e109eae26413834019f99b2"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
