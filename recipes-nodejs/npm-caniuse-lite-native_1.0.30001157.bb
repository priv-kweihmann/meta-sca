SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001157.tgz"
SRC_URI[md5sum] = "d3aaaf41babf61e077cb0120ba380915"
SRC_URI[sha256sum] = "39931f520a1eabe4a1823e6f0612f05b0a547be25e1f468d13e4bbbe91de7ea9"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
