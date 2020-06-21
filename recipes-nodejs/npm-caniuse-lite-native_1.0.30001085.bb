SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001085.tgz"
SRC_URI[md5sum] = "26fc9e8020ccbb7b899087ce982e1fb5"
SRC_URI[sha256sum] = "ac13800b74989c9b6e44dc53abba89a8eef5d5f6fa4e7ea51ee134bc24f2b207"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
