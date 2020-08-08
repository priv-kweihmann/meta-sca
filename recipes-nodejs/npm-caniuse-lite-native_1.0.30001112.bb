SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001112.tgz"
SRC_URI[md5sum] = "ac7b2c371da0fa1518e3e43b3af5977e"
SRC_URI[sha256sum] = "ac1e51f723ecaee845693f494265dd500ad5a14502c74259013a3394aa5f4e0c"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
