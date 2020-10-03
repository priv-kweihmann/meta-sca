SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001142.tgz"
SRC_URI[md5sum] = "36eca0a8651383106c9f6ecfca3138cb"
SRC_URI[sha256sum] = "f9ea42eda48122f9d266a10231484bc23b04784861289fa034b5caf680a495f2"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
