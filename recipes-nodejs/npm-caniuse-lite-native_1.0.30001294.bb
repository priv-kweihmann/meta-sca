SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001294.tgz"
SRC_URI[md5sum] = "246160c7eb56b64e9a5c4d8feb50c7c6"
SRC_URI[sha256sum] = "189387c34d27a7a8b15664ff3abc406761cc58226aadf903dfdfeed9f502351c"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
