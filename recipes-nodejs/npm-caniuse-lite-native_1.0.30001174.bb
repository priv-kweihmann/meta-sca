SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001174.tgz"
SRC_URI[md5sum] = "8ca3c523fc3c21f8609584c6b53c0363"
SRC_URI[sha256sum] = "b92b377d247ecd2f39f4d855a16c050b3c78f902958c4fa9be4abe539c4cb785"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
