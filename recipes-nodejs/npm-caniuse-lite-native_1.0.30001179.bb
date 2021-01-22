SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001179.tgz"
SRC_URI[md5sum] = "90634c2a01ad5d545bdaff4f69cf9e51"
SRC_URI[sha256sum] = "937f5b786c687f1cfc0090360311de9ab8e7326af1ba9b44cbadbb7a2d006db5"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
