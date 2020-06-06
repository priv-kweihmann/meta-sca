SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001078.tgz"
SRC_URI[md5sum] = "ba4486040373cf37dfac172574980fb3"
SRC_URI[sha256sum] = "7796d50b709f551d8a6c63d57f57aa316d3dbbe91e3a2fcf55225aede974eba0"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
